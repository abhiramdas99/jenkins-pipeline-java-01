# jenkins-pipeline-java-01
simple pipeline to deploy java web application  only using  git, jenkins & tomcat
---------------------------------------------------------------------------------
step 1 -  Lunch ec2 instance with ubuntu 20.4 ami . One is  Jenkins-server , anather is tomact-webserver <br>
step 2 -  Provisioning jenkins server follow the link  <br>
step 3 -  Provisioning tomcat server follow the link  <br>
step 4 - add new the node in jenkins dashboard ? manage node > add new node  <br>
         * Note that, you need to do the following setting before add the tomcat node to jenkins  <br> 
         1) create a folder , lets called as jenkins_job and give full permission to this folder with subfolder. The command is -  <br>
            mkdir jenkins_job  <br>
            chmod -R 777 jenkins_job (once aplly the command the colo will be changedfor this folder)  <br>    
         2) provide th above path ie. /home/ubuntu/jenkins_job  to the asked "Remote root directory" <br>            
         3) give level name same as node name  i.e - webserver-tomcat9  <br>
