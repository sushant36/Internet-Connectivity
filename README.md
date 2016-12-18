# Internet-Connectivity
Depicts whether your device has working internet connection or not in super fast time.

# How to use

        public boolean isInternetAvailable() {
        boolean b = false;
	
        try {
            b = Boolean.parseBoolean(new IsInternetAvailable().execute().get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return  b;

	} 
