public class MainActivity extends AppCompatActivity {
	private boolean isInternetConnected;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
	    
	 isInternetConnected=isInternetAvailable();   
    }

public boolean isInternetAvailable() {
        boolean isConnectedFast = false;
        try {
            isConnectedFast = Boolean.parseBoolean(new IsInternetAvailable().execute().get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        return  isConnectedFast;
	}	
 
}
