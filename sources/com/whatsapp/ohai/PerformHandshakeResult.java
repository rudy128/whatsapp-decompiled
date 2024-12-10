package com.whatsapp.ohai;

import X.AnonymousClass000;
import X.C17890vO;
import X.C17900vP;
import X.C18070vi;
import java.util.Arrays;

public final class PerformHandshakeResult {
    public final byte[] revcBuffer;
    public final byte[] sendBuffer;
    public final short state;

    public static /* synthetic */ PerformHandshakeResult copy$default(PerformHandshakeResult performHandshakeResult, short s, byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            s = performHandshakeResult.state;
        }
        if ((i & 2) != 0) {
            bArr = performHandshakeResult.sendBuffer;
        }
        if ((i & 4) != 0) {
            bArr2 = performHandshakeResult.revcBuffer;
        }
        return performHandshakeResult.copy(s, bArr, bArr2);
    }

    public final short component1() {
        return this.state;
    }

    public final byte[] component2() {
        return this.sendBuffer;
    }

    public final byte[] component3() {
        return this.revcBuffer;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PerformHandshakeResult) {
                PerformHandshakeResult performHandshakeResult = (PerformHandshakeResult) obj;
                if (this.state != performHandshakeResult.state || !C18070vi.A18(this.sendBuffer, performHandshakeResult.sendBuffer) || !C18070vi.A18(this.revcBuffer, performHandshakeResult.revcBuffer)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.state * 31) + Arrays.hashCode(this.sendBuffer)) * 31) + Arrays.hashCode(this.revcBuffer);
    }

    public PerformHandshakeResult(short s, byte[] bArr, byte[] bArr2) {
        C18070vi.A0k(bArr, bArr2);
        this.state = s;
        this.sendBuffer = bArr;
        this.revcBuffer = bArr2;
    }

    public final PerformHandshakeResult copy(short s, byte[] bArr, byte[] bArr2) {
        C18070vi.A0j(bArr, bArr2);
        return new PerformHandshakeResult(s, bArr, bArr2);
    }

    public final byte[] getRevcBuffer() {
        return this.revcBuffer;
    }

    public final byte[] getSendBuffer() {
        return this.sendBuffer;
    }

    public final short getState() {
        return this.state;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PerformHandshakeResult(state=");
        A10.append(this.state);
        A10.append(", sendBuffer=");
        C17890vO.A1C(A10, this.sendBuffer);
        A10.append(", revcBuffer=");
        return C17900vP.A0B(Arrays.toString(this.revcBuffer), A10);
    }
}
