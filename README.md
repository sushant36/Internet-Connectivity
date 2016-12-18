# Internet-Connectivity
Depicts whether your device has working internet connection or not in super fast time.

Unlike many other repositories which only detects whether your device is connected to wifi or Internet, it tells you whether your device has working internet connection or not. 

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
