package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.9oV  reason: invalid class name and case insensitive filesystem */
public final class C192499oV {
    public final AnonymousClass11S A00;
    public final C26031Qo A01;
    public final JniBridge A02;

    public final byte[] A01(AnonymousClass1BI r12, UserJid userJid, String str, byte[] bArr) {
        long j;
        Object obj;
        NativeHolder nativeHolder;
        String rawString;
        String rawString2;
        int i;
        if (userJid == null || r12 == null || bArr == null || bArr.length == 0) {
            return null;
        }
        C61252pN r1 = new C61252pN(bArr);
        if (C22971Dz.A0d(r12)) {
            j = 5;
            obj = this.A02.wajContext.get();
            nativeHolder = r1.A00;
            rawString = userJid.getRawString();
            rawString2 = r12.getRawString();
            i = 2;
        } else if (C22971Dz.A0e(r12)) {
            j = 5;
            obj = this.A02.wajContext.get();
            nativeHolder = r1.A00;
            rawString = r12.getRawString();
            rawString2 = userJid.getRawString();
            i = 0;
        } else if (C22971Dz.A0O(r12)) {
            j = 5;
            obj = this.A02.wajContext.get();
            nativeHolder = r1.A00;
            rawString = r12.getRawString();
            rawString2 = userJid.getRawString();
            i = 1;
        } else if (!C22971Dz.A00 ? (r12 instanceof C173408v1) : r12.getType() == 6) {
            j = 5;
            obj = this.A02.wajContext.get();
            nativeHolder = r1.A00;
            rawString = r12.getRawString();
            rawString2 = userJid.getRawString();
            i = 4;
        } else if (C22971Dz.A0a(r12)) {
            j = 5;
            obj = this.A02.wajContext.get();
            nativeHolder = r1.A00;
            rawString = r12.getRawString();
            rawString2 = userJid.getRawString();
            i = 3;
        } else {
            this.A01.A00(AnonymousClass8oI.A0A, (String) null);
            return null;
        }
        NativeHolder nativeHolder2 = (NativeHolder) JniBridge.jvidispatchOIOOOOO(i, j, str, obj, nativeHolder, rawString, rawString2);
        if (nativeHolder2 == null) {
            return null;
        }
        AnonymousClass9ZA r0 = new AnonymousClass9ZA(nativeHolder2);
        JniBridge.getInstance();
        return (byte[]) JniBridge.jvidispatchOIO(0, 50, r0.A00);
    }

    public final AnonymousClass1BI A00(AnonymousClass1BI r3, AnonymousClass205 r4) {
        AnonymousClass1BI A002;
        AnonymousClass1BI r1 = r4.A00;
        if (!C22971Dz.A0d(r1)) {
            return r1;
        }
        if (C22971Dz.A0N(r3)) {
            return r3;
        }
        boolean A0U = C22971Dz.A0U(r1);
        AnonymousClass11S r0 = this.A00;
        if (A0U) {
            A002 = r0.A09();
        } else {
            A002 = AnonymousClass11S.A00(r0);
        }
        return A002;
    }

    public C192499oV(AnonymousClass11S r1, C26031Qo r2, JniBridge jniBridge) {
        C18070vi.A0o(r1, jniBridge, r2);
        this.A00 = r1;
        this.A02 = jniBridge;
        this.A01 = r2;
    }
}
