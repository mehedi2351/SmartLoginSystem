module com.example.smartloginsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    // requires com.google.gson; // uncomment if you use Gson

    // Allow JavaFX to use reflection for FXML + Application classes
    opens com.example.smartloginsystem to javafx.graphics, javafx.fxml;
    opens com.smartlogin to javafx.fxml;
    opens com.example.smartthesis to javafx.fxml; // ✅ Added for FindSupervisorController

    // Export packages to make them visible to other modules
    exports com.example.smartloginsystem;
    exports com.smartlogin;
    exports com.example.smartthesis; // ✅ Added for external visibility
}
