package org.npci.upi.security.services;

import android.os.Bundle;
import android.os.IInterface;

public interface CLResultReceiver extends IInterface {
    void BLY(Bundle bundle);

    void CHP(Bundle bundle);

    void CPs(Bundle bundle);

    void CPt(Bundle bundle);
}
