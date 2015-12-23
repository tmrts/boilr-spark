spark-submit --master local[{{LocalExecutorThreads}}]\
             --class {{OrganizationPackage}}.{{MainClass}}\
             target/scala-2.10/{{Jarfile}} 
