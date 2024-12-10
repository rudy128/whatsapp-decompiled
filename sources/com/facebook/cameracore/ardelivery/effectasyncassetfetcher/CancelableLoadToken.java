package com.facebook.cameracore.ardelivery.effectasyncassetfetcher;

import X.C22407B6l;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;

public class CancelableLoadToken implements CancelableToken {
    public C22407B6l mLoadToken;

    public boolean cancel() {
        C22407B6l b6l = this.mLoadToken;
        if (b6l != null) {
            return b6l.cancel();
        }
        return false;
    }

    public CancelableLoadToken(C22407B6l b6l) {
        this.mLoadToken = b6l;
    }
}
