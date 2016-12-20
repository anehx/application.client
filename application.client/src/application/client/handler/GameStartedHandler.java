package application.client.handler;

import protocol.GameStartedMessage;

public class GameStartedHandler extends MessageHandler {
	public void gameStarted(GameStartedMessage message) {
		this.labyrinth.setStarted(true);
		
		/*
		 * TODO: enable this for parsing the labyrinth
		JSONParser parser = new JSONParser();
        
        try {
        	String applicationPath = System.getProperty("user.dir");
        	String ressourcePath = applicationPath + "/application.client/src/model/labyrinth.json";
        	Object obj = parser.parse(new FileReader(ressourcePath));
            
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray data = (JSONArray) jsonObject.get("data");

            for (Object o: data) {
                System.out.println(o);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
		
		this.log.addMessage("Game started");
	}
}
