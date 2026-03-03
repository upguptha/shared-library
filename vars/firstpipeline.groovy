// importing the Calculator class from package which is there in src folder
import com.uppala.builds.Calculator

// define a function called 'call' that accepts a MAP parameter pipelineParams
def call(Map pipelineParams){
    // create a instance of the Calculator class  
    Calculator calculator = new Calculator(this)
    pipeline {
        agent {
        label 'java-maven'
         }
        environment {
            // set an environment varaiable APPLICATION_NAME 
            APPLICATION_NAME = "${pipelineParams.appName}"
        }
        stages {
            stage ('Build') {
                steps{
                    echo "Building the application"
                    echo "********starting Building ${env.APPLICATION_NAME} application "
                    }
                }
            stage ('Calculate') {
                    steps {
                        script {
                            echo "Calling caluculator method of source folder"
                            echo "******printing the sum of values******"
                            // call the add method from the pipeline of vars
                            def sum = calculator.add(2,3)
                            echo "Sum of 2 numbers is ${sum}" 
                            }
                         }
                        }
            stage ('Test') {
                steps {
                    echo "Testing the project"
                     }
                    }
            stage ('devDeploy') {
                steps {
                        echo "Deploying the project into Dev environment"
                         // calling normal method which is there in this one.
                      script {
                           def result = this.newcal(4,5)
                           echo "Result is ${result}"
                        }
                    }
                }
            }
        }
        }




def newcal(fifthNumber,sixthNumber) {
    return fifthNumber+sixthNumber
}

//variable place holder
//local variables : ${variable}
//Env variable: ${env.variable}
//parameters section: ${params.varaiable}

//sharelibraries pipeline parameters: ${pipelineParams.variable}




