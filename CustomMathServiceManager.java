package android.app;

import android.content.Context;
import android.os.RemoteException;
import android.os.ICustomMathService;
import android.util.Log;

public class CustomMathServiceManager {
    private static final String TAG ="CustomMathServiceManager";
    private ICustomMathService mService;

    /**
     * {@hide}
     */
    public CustomMathServiceManager (Context context, ICustomMathService service) {
        Log.d(TAG, "CustomMathServiceManager constructor "+service);
        mService = service;
    }

    public int mul (int val1, int val2) {
        try {
            return mService.mul(val1, val2);
        }
        catch (Exception e) {
            Log.e(TAG, e.toString());
            e.printStackTrace();
        }
        return 0;
    }

    public int div (int val1, int val2) {
        try {
            return mService.div(val1, val2);
        }
        catch (Exception e) {
            Log.e(TAG, e.toString());
            e.printStackTrace();
        }
        return 0;
    }
}
