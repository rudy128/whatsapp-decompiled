package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.io.IOException;

@Deprecated
/* renamed from: X.1PH  reason: invalid class name */
public class AnonymousClass1PH implements AnonymousClass1PF, AnonymousClass1PG {
    public final AnonymousClass18O A00;
    public final AnonymousClass1P2 A01;
    public final AnonymousClass1P0 A02;
    public final AnonymousClass1PC A03;
    public final C25631Oy A04;
    public final AnonymousClass1PI A05;
    public final AnonymousClass1P3 A06;
    public final C25601Ov A07;

    public boolean A01() {
        Cursor A0A;
        C28781at A052 = this.A03.A01.get();
        try {
            A0A = ((C28801av) A052).A02.A0A("SELECT COUNT(*) as count FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0", "SignalPreKeyStore/hasUnsentPreKeys", (String[]) null);
            if (A0A.moveToNext()) {
                boolean z = false;
                if (A0A.getInt(A0A.getColumnIndexOrThrow("count")) != 0) {
                    z = true;
                }
                A0A.close();
                A052.close();
                StringBuilder sb = new StringBuilder();
                sb.append("SignalPreKeyStore/hasUnsentPreKeys has unsent prekeys: ");
                sb.append(z);
                Log.i(sb.toString());
                return z;
            }
            throw new SQLiteException("Unable to count unsent entries in prekeys table");
        } catch (Throwable th) {
            try {
                A052.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean BFm(C59482mN r3) {
        return this.A06.A0b(C62812s2.A00(r3));
    }

    public C54022dT BSl() {
        try {
            C52962bl A032 = this.A02.A03();
            C62202r0 r2 = new C62202r0(A032.A01);
            AnonymousClass9ZN r1 = new AnonymousClass9ZN(A032.A00);
            Log.i("SignalProtocolStore/get-identity loading identity key pair");
            return new C54022dT(r2, r1);
        } catch (AnonymousClass1P8 unused) {
            throw new SQLiteException("Invalid public key stored in identities table");
        }
    }

    public int BU5() {
        return this.A06.A06.A02();
    }

    public C19964A0z Bhr(C59482mN r3) {
        try {
            return new C19964A0z(this.A06.A0F(C62812s2.A00(r3)).A00());
        } catch (IOException unused) {
            throw new AssertionError("serialize/deserialize failed from Session object");
        }
    }

    public void CGj(C62202r0 r4, C59482mN r5) {
        C58252kO r2;
        if (r4 != null) {
            try {
                r2 = new C58252kO(C63962tz.A01(r4.A00.A00()));
            } catch (C22511Ak unused) {
                throw new AssertionError("Conversion between ECPublicKey and CurvePublicKey should never fail");
            }
        } else {
            r2 = null;
        }
        this.A06.A0a(r2, C62812s2.A00(r5));
    }

    public void COh(C59482mN r4, C19964A0z a0z) {
        try {
            if (a0z.A01.A00.aliceBaseKey_.A06().length != 0) {
                this.A06.A0e(C62812s2.A00(r4), a0z.A01());
                return;
            }
            throw new IOException("Alice base key missing from session");
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot store invalid session", e);
        }
    }

    public AnonymousClass1PH(AnonymousClass18O r2, AnonymousClass1P2 r3, AnonymousClass1P0 r4, AnonymousClass1PC r5, C25631Oy r6, C25601Ov r7, AnonymousClass1PD r8, AnonymousClass1P3 r9) {
        this.A00 = r2;
        this.A06 = r9;
        this.A07 = r7;
        this.A04 = r6;
        this.A05 = new AnonymousClass1PI(r8);
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }

    public static C54492eE A00(AnonymousClass2S5 r5, int i) {
        byte[] A002 = r5.A00().A01.A00();
        int length = A002.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(A002, 1, bArr, 0, length);
        byte[] bArr2 = new byte[3];
        bArr2[2] = (byte) i;
        bArr2[1] = (byte) (i >> 8);
        bArr2[0] = (byte) (i >> 16);
        return new C54492eE(bArr2, bArr, (byte[]) null);
    }

    public boolean Bgm(C62202r0 r3, C59482mN r4) {
        return AnonymousClass1P0.A00(C62812s2.A00(r4), r3.A00.A00);
    }
}
