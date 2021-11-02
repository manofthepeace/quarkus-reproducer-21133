# quarkus-reproducer-21133

Run the stub project first using `mvn quarkus:dev`

Compile a native app of the execption project using mvn clean package -Pnative

run the native app

run `curl -XGET http://localhost:8080/hello`

Application will throw a NoSuchMethodException

Swap the resteasy to resteasy-jackson in the pom.xml

recompile natively

Rerun the curl, it will work