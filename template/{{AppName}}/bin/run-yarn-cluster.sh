spark-submit --name {{AppName}}\
             --master yarn-cluster\
             --driver-memory {{LocalExecutorMemory}}\
             --class {{OrganizationPackage}}.{{MainClass}}\
             target/scala-2.10/{{Jarfile}}
