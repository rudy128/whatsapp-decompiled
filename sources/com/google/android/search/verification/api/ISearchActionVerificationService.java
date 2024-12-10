package com.google.android.search.verification.api;

import X.AAN;
import X.AnonymousClass000;
import X.AnonymousClass04E;
import X.AnonymousClass8CV;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface ISearchActionVerificationService extends IInterface {

    public abstract class Stub extends AnonymousClass8CV implements ISearchActionVerificationService {
        public static final String DESCRIPTOR = "com.google.android.search.verification.api.ISearchActionVerificationService";
        public static final int TRANSACTION_getVersion = 2;
        public static final int TRANSACTION_isSearchAction = 1;

        public class Proxy extends AAN implements ISearchActionVerificationService {
            public Proxy(IBinder iBinder) {
                super(iBinder, Stub.DESCRIPTOR);
            }

            public int getVersion() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            public boolean isSearchAction(Intent intent, Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                if (intent == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    intent.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                if (bundle == null) {
                    obtainAndWriteInterfaceToken.writeInt(0);
                } else {
                    obtainAndWriteInterfaceToken.writeInt(1);
                    bundle.writeToParcel(obtainAndWriteInterfaceToken, 0);
                }
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken);
                boolean A1O = AnonymousClass000.A1O(transactAndReadException.readInt());
                transactAndReadException.recycle();
                return A1O;
            }
        }

        public abstract boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2);

        public static ISearchActionVerificationService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            if (queryLocalInterface instanceof ISearchActionVerificationService) {
                return (ISearchActionVerificationService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        public Stub() {
            throw AnonymousClass04E.createAndThrow();
        }
    }

    int getVersion();

    boolean isSearchAction(Intent intent, Bundle bundle);
}
