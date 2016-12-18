
public class IsInternetAvailable extends AsyncTask<String, String, String> {

    @Override
    protected String doInBackground(String... params) {
        boolean isConnected;
        try {
            InetAddress ipAddr = InetAddress.getByName("www.google.com"); //You can replace it with your name
             isConnected=!ipAddr.equals("");

        } catch (Exception e) {
             isConnected=false;
        }
        return String.valueOf(isConnected);
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);
    }
}
