# Create a shared archive
java -XX:SharedArchiveFile=app-cds.jsa -XX:+UseAppCDS -jar YourApplication.jar
# Run the application with the shared archive
java -XX:SharedArchiveFile=app-cds.jsa -jar YourApplication.jar