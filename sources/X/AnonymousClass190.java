package X;

import android.app.ActivityManager;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.190  reason: invalid class name */
public abstract class AnonymousClass190 {
    public String A0A() {
        byte[] bArr;
        AnonymousClass192 r3 = (AnonymousClass192) this;
        AnonymousClass11S r1 = r3.A03;
        r1.A0I();
        Me me = r1.A00;
        int A06 = r1.A06();
        if (me != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(me.jabber_id);
            sb.append(":");
            sb.append(A06);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("new-");
        String A0j = r3.A08.A0j();
        try {
            UUID fromString = UUID.fromString(A0j);
            ByteBuffer allocate = ByteBuffer.allocate(16);
            allocate.putLong(fromString.getMostSignificantBits());
            allocate.putLong(fromString.getLeastSignificantBits());
            bArr = allocate.array();
        } catch (IllegalArgumentException unused) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("CrashLogsImpl/getBytesFromUUIDString/invalid-input ");
            sb3.append(A0j);
            Log.e(sb3.toString());
            bArr = new byte[0];
        }
        sb2.append(Base64.encodeToString(bArr, 11));
        return sb2.toString();
    }

    public String A0B(String str) {
        int memoryClass;
        AnonymousClass192 r1 = (AnonymousClass192) this;
        ActivityManager A04 = r1.A06.A04();
        if (A04 == null) {
            Log.w("memorydumpuploadservice/get-upload-params am=null");
            memoryClass = 16;
        } else {
            memoryClass = A04.getMemoryClass();
        }
        AnonymousClass11W.A00(r1.A07, r1.A0B, C18170vs.A02());
        return AnonymousClass192.A03(str, memoryClass);
    }

    public void A0D(AnonymousClass1O9 r9, String str) {
        AnonymousClass192 r2 = (AnonymousClass192) this;
        C59092lk CPC = r9.CPC(str);
        Throwable th = r9;
        while (th.getCause() != null) {
            th = th.getCause();
        }
        String str2 = CPC.A01;
        String str3 = CPC.A00;
        Log.e(str2, th);
        AnonymousClass192.A07(new AnonymousClass3EZ(str2, th), r2, str2, str3, (String) null, new HashMap(), true);
    }

    public void A0E(String str, String str2, Throwable th) {
        Log.e(str, th);
        AnonymousClass192.A07(new AnonymousClass3EZ(str, th), (AnonymousClass192) this, str, str2, (String) null, new HashMap(), true);
    }

    public void A0F(String str, String str2, Map map, boolean z) {
        AnonymousClass192.A07(new AnonymousClass3EZ(str), (AnonymousClass192) this, str, str2, (String) null, map, z);
    }

    public void A0H(String str, String str2, boolean z, String str3) {
        AnonymousClass192.A07(new AnonymousClass3EZ(str), (AnonymousClass192) this, str, str2, str3, new HashMap(), z);
    }

    public abstract void A0I(HashSet hashSet, Map map, boolean z, boolean z2, boolean z3, boolean z4);

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2Wv, java.lang.Object] */
    public String A0C(String str, String str2, boolean z) {
        AnonymousClass192 r2 = (AnonymousClass192) this;
        ? obj = new Object();
        A7N a7n = new A7N(r2.A04, new C20668AUa(obj, r2, 0), (C184599bD) null, r2.A0A, "https://crashlogs.whatsapp.net/wa_fls_upload_check", r2.A0B.A02(), (String) null, (String) null, 6, false, false, false);
        a7n.A06("access_token", "1063127757113399|745146ffa34413f9dbb5469f5370b7af");
        a7n.A06("from_jid", str);
        a7n.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2);
        a7n.A06("support_exception_only_upload", String.valueOf(z));
        int A04 = a7n.A04((C191779nA) null);
        if (A04 == 200) {
            return obj.A00;
        }
        if (A04 == 403) {
            obj.A00 = "no_upload";
            return "no_upload";
        } else if (A04 != 500) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown response code ");
            sb.append(A04);
            sb.append(" from crash upload server");
            throw new IOException(sb.toString());
        } else {
            throw new IOException("Response 500 received from server");
        }
    }

    public void A0G(String str, String str2, boolean z) {
        A0F(str, str2, new HashMap(), z);
    }
}
