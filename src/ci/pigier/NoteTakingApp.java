	package ci.pigier;
	
	import ci.pigier.controllers.BaseController;
	import ci.pigier.ui.FXMLPage;
	import javafx.application.Application;
	import javafx.fxml.FXMLLoader;
	import javafx.scene.Parent;
	import javafx.scene.Scene;
	import javafx.stage.Stage;
	
	public class NoteTakingApp extends Application {
	
		@Override
	    public void start(Stage stage) throws Exception {
			
			 // Charger les notes depuis la base de données avant chargement de la scène
			
	        BaseController controller = new BaseController();
	        controller.selectNotes();
			
	        //Chargement de l'application 
	        Parent root = FXMLLoader.load(FXMLPage.LIST.getPage());
	        
	        Scene scene = new Scene(root);
	     
	        stage.setScene(scene);
	        stage.setTitle("P'Note-Taking Application v1.0.0");
	        stage.setResizable(false);
	        stage.show();
	    }
	
	    /**
	     * @param args the command line arguments
	     */
	    public static void main(String[] args) {
	        launch(args);
	    }
	    
	
	}