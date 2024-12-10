package com.facebook.wearable.airshield.securer;

import X.AnonymousClass1A8;
import X.AnonymousClass1Y1;
import X.C17880vN;
import X.C18070vi;
import X.C24585CAg;
import X.CAQ;
import X.CAW;
import com.facebook.jni.HybridData;
import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.datax.Connection;

public final class Preamble {
    public static final CAQ Companion = new Object();
    public Connection connection;
    public final Object connectionLock;
    public final HybridData mHybridData;

    private final native void acceptAuthenticationNative(byte[] bArr, boolean z);

    private final native boolean asMainNative();

    private final native long connectionNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native void rejectAuthenticationNative(int i);

    private final native byte[] rxChallengeNative();

    private final native int streamIdNative();

    private final native byte[] txChallengeNative();

    public final void acceptAuthentication(byte[] bArr, boolean z) {
        C18070vi.A0d(bArr, 0);
        acceptAuthenticationNative(bArr, z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CAQ, java.lang.Object] */
    static {
        AnonymousClass1A8.A06("airshield_light_mbed_jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Preamble(HybridData hybridData, int i, AnonymousClass1Y1 r4) {
        this((i & 1) != 0 ? null : hybridData);
    }

    private final Connection createConnection() {
        C24585CAg cAg = Connection.Companion;
        return new Connection(connectionNative());
    }

    public final Connection getConnection() {
        Connection connection2;
        synchronized (this.connectionLock) {
            connection2 = this.connection;
            if (connection2 == null) {
                connection2 = createConnection();
                this.connection = connection2;
            }
        }
        return connection2;
    }

    public final Hash getRxChallenge() {
        CAW caw = Hash.Companion;
        byte[] rxChallengeNative = rxChallengeNative();
        C18070vi.A0d(rxChallengeNative, 0);
        Hash hash = new Hash((HybridData) null);
        hash.setRaw(rxChallengeNative);
        return hash;
    }

    public final Hash getTxChallenge() {
        CAW caw = Hash.Companion;
        byte[] txChallengeNative = txChallengeNative();
        C18070vi.A0d(txChallengeNative, 0);
        Hash hash = new Hash((HybridData) null);
        hash.setRaw(txChallengeNative);
        return hash;
    }

    public final boolean getAsMain() {
        return asMainNative();
    }

    public final int getStreamId() {
        return streamIdNative();
    }

    public final void rejectAuthentication(int i) {
        rejectAuthenticationNative(i);
    }

    public Preamble(HybridData hybridData) {
        this.connectionLock = C17880vN.A0p();
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}
