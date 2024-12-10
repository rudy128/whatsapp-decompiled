package X;

import android.media.MediaCrypto;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import com.facebook.android.exoplayer2.util.Util;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.CnE  reason: case insensitive filesystem */
public final class C25852CnE {
    public final UUID A00;
    public final MediaDrm A01;

    public C24839CMh A01(String str, byte[] bArr, byte[] bArr2, int i) {
        MediaDrm.KeyRequest keyRequest = this.A01.getKeyRequest(bArr, bArr2, str, i, (HashMap) null);
        return new C24839CMh(keyRequest.getData(), keyRequest.getDefaultUrl());
    }

    public static C25852CnE A00(UUID uuid) {
        try {
            return new C25852CnE(uuid);
        } catch (UnsupportedSchemeException e) {
            throw new C2K(e, 1);
        } catch (Exception e2) {
            throw new C2K(e2, 2);
        }
    }

    public C24840CMi A02() {
        MediaDrm.ProvisionRequest provisionRequest = this.A01.getProvisionRequest();
        return new C24840CMi(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    public /* bridge */ /* synthetic */ CP9 A03(byte[] bArr) {
        UUID uuid = this.A00;
        MediaCrypto mediaCrypto = new MediaCrypto(uuid, bArr);
        if (Util.A00 < 27 && C24736CHy.A00.equals(uuid)) {
            uuid = C24736CHy.A01;
        }
        return new CP9(mediaCrypto, uuid, bArr);
    }

    public HashMap A04(byte[] bArr) {
        return this.A01.queryKeyStatus(bArr);
    }

    public void A05() {
        this.A01.setPropertyString("securityLevel", "L3");
    }

    public void A06(C24760CIx cIx) {
        this.A01.setOnEventListener(new C26363CyP(cIx, this));
    }

    public /* synthetic */ void A07(C24760CIx cIx, byte[] bArr, int i) {
        BE7.A18(cIx.A00.A09, bArr, i);
    }

    public void A08(byte[] bArr) {
        this.A01.closeSession(bArr);
    }

    public void A09(byte[] bArr) {
        this.A01.provideProvisionResponse(bArr);
    }

    public void A0A(byte[] bArr, byte[] bArr2) {
        this.A01.restoreKeys(bArr, bArr2);
    }

    public byte[] A0B() {
        return this.A01.openSession();
    }

    public byte[] A0C(byte[] bArr, byte[] bArr2) {
        if (C24736CHy.A00.equals(this.A00)) {
            bArr2 = C82.A00(bArr2);
        }
        return this.A01.provideKeyResponse(bArr, bArr2);
    }

    public C25852CnE(UUID uuid) {
        C26056CrS.A01(uuid);
        UUID uuid2 = C24736CHy.A01;
        if (!uuid2.equals(uuid)) {
            this.A00 = uuid;
            UUID uuid3 = uuid;
            if (Util.A00 < 27 && C24736CHy.A00.equals(uuid)) {
                uuid3 = uuid2;
            }
            MediaDrm mediaDrm = new MediaDrm(uuid3);
            this.A01 = mediaDrm;
            if (C24736CHy.A04.equals(uuid) && "ASUS_Z00AD".equals(Util.A04)) {
                mediaDrm.setPropertyString("securityLevel", "L3");
                return;
            }
            return;
        }
        throw BE8.A0W("Use C.CLEARKEY_UUID instead");
    }
}
