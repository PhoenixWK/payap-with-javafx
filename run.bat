@echo off
echo Building the application with JavaFX profile...
call mvnw clean package -Pjavafx -DskipTests

echo Running the application...
java -Djavafx.verbose=false ^
     -Dprism.verbose=false ^
     -Djavafx.animation.framerate=60 ^
     --module-path "target/modules" ^
     --add-modules javafx.controls,javafx.fxml ^
     -cp target/payap-0.0.1-SNAPSHOT.jar com.finance.payap.PayapApplication

pause 