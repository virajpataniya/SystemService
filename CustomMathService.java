package com.android.server;

import android.util.Slog;
import android.os.RemoteException;
import android.os.ICustomMathService;
import java.util.HashMap;

public class CustomMathService extends ICustomMathService.Stub {
    private static final String TAG="CustomMathService";

    public CustomMathService() {
        Slog.d(TAG, "CustomMathService is starting... ");
    }
    @Override
    public int mul(int val1, int val2) throws RemoteException {
        try{
            Slog.d(TAG, "Inside multiply method CustomMathService ... ");
            return val1*val2;
        }
        catch (java.lang.ArithmeticException ex){
            Slog.d(TAG, "Arithmetic Exception in multiply occurs ... ");
        }
        return 0;
    }

    @Override
    public int div(int val1, int val2) throws RemoteException {
        try {
            Slog.d(TAG, "Inside division method CustomMathService ... ");
            return val1/val2;
        }
        catch (java.lang.ArithmeticException ex){
            Slog.d(TAG, "Arithmetic Exception in division occurs ... ");
        }
        return 0;
    }
}