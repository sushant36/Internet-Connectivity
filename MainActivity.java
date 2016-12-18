# How To Use

# Call isInternetAvailable()

   public boolean isInternetAvailable() {
        boolean isConnectedFast = false;
        try {
            isConnectedFast = Boolean.parseBoolean(new IsInternetAvailable().execute().get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return  isConnectedFast;
	}	
 
