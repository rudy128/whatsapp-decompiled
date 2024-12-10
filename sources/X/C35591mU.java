package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;

/* renamed from: X.1mU  reason: invalid class name and case insensitive filesystem */
public class C35591mU {
    public final C19880zA A00;
    public final C19880zA A01;
    public final AnonymousClass11S A02;
    public final C25001Mm A03;
    public final AnonymousClass1M9 A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass1P1 A06;
    public final AnonymousClass1P3 A07;
    public final C25571Os A08;
    public final C32691hb A09;
    public final AnonymousClass1MZ A0A;
    public final C26111Qw A0B;
    public final AnonymousClass1WX A0C;
    public final AnonymousClass1U5 A0D;
    public final AnonymousClass1MR A0E;
    public final C18030ve A0F;
    public final C25931Qe A0G;
    public final AnonymousClass1N7 A0H;
    public final AnonymousClass1PT A0I;
    public final C34661ks A0J;
    public final AnonymousClass1W9 A0K;
    public final AnonymousClass00H A0L;
    public final AnonymousClass00H A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P;
    public final AnonymousClass00H A0Q;
    public final AnonymousClass00H A0R;
    public final AnonymousClass00H A0S;
    public final AnonymousClass00H A0T;
    public final AnonymousClass00H A0U;
    public final Handler A0V = new Handler(Looper.getMainLooper());

    public byte[] A00(DeviceJid deviceJid, AnonymousClass205 r17, C54492eE r18, C54492eE r19, byte[] bArr, byte[] bArr2, int i, int i2, boolean z) {
        DeviceJid deviceJid2 = deviceJid;
        C71363Ez A082 = this.A08.A08(deviceJid2);
        try {
            C60002nE A012 = this.A06.A01(C63962tz.A02(deviceJid2));
            StringBuilder sb = new StringBuilder();
            sb.append("RetryReceiptHandler/axolotl checking sessions for ");
            sb.append(A012);
            sb.append(" due to retry receipt for ");
            AnonymousClass205 r2 = r17;
            sb.append(r2);
            Log.i(sb.toString());
            byte[] bArr3 = bArr2;
            int i3 = i2;
            if (bArr2 != null) {
                C54492eE r11 = r18;
                if (r18 != null) {
                    if (z) {
                        AnonymousClass1P3 r1 = this.A07;
                        if (!r1.A0b(A012)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("RetryReceiptHandler/axolotl Not processing keys from the receipt, missing session for ");
                            sb2.append(r2);
                            Log.i(sb2.toString());
                        } else if (r1.A0F(A012).A01.A00.remoteRegistrationId_ != i3) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("RetryReceiptHandler/Not processing keys from the receipt, registrationId does not match for ");
                            sb3.append(r2);
                            Log.i(sb3.toString());
                        }
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("axolotl processing keys from the receipt for jid:");
                    sb4.append(deviceJid2);
                    Log.i(sb4.toString());
                    int A072 = this.A07.A07(C63962tz.A02(deviceJid2), r19, r11, bArr3, bArr, (byte) 5);
                    if (A072 == 0) {
                        this.A0V.post(new C146517Pk(this, deviceJid2, 4));
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("RetryReceiptHandler/Error received from SignalCoordinator; status=");
                        sb5.append(A072);
                        Log.e(sb5.toString());
                    }
                }
            }
            AnonymousClass1P3 r6 = this.A07;
            if (r6.A0b(A012)) {
                AnonymousClass9XJ r12 = r6.A0F(A012).A01;
                byte[] A062 = r12.A00.aliceBaseKey_.A06();
                if (r12.A00.remoteRegistrationId_ != i3) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("RetryReceiptHandler/axolotl deleting session due to registration id change for ");
                    sb6.append(r2);
                    Log.i(sb6.toString());
                    r6.A0G(A012);
                    r6.A0S(A012);
                } else {
                    int i4 = i;
                    if (i4 > 2 && r6.A0d(A012, r2)) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("RetryReceiptHandler/axolotl will wait to send ");
                        sb7.append(r2);
                        sb7.append(" until a new prekey has been fetched");
                        Log.i(sb7.toString());
                    } else if (i4 == 2) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("RetryReceiptHandler/axolotl will record the base key used to send ");
                        sb8.append(r2);
                        Log.i(sb8.toString());
                        r6.A0V(A012, r2, A062);
                    }
                }
                if (A082 != null) {
                    A082.close();
                }
                return A062;
            }
            if (A082 == null) {
                return null;
            }
            A082.close();
            return null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public C35591mU(C19880zA r3, C19880zA r4, AnonymousClass11S r5, C25001Mm r6, AnonymousClass1M9 r7, AnonymousClass11P r8, AnonymousClass1P1 r9, AnonymousClass1P3 r10, C25571Os r11, C32691hb r12, AnonymousClass1MZ r13, C26111Qw r14, AnonymousClass1WX r15, AnonymousClass1U5 r16, AnonymousClass1MR r17, C18030ve r18, C25931Qe r19, AnonymousClass1N7 r20, AnonymousClass1PT r21, C34661ks r22, AnonymousClass1W9 r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27, AnonymousClass00H r28, AnonymousClass00H r29, AnonymousClass00H r30, AnonymousClass00H r31, AnonymousClass00H r32, AnonymousClass00H r33) {
        this.A05 = r8;
        this.A0F = r18;
        this.A02 = r5;
        this.A08 = r11;
        this.A03 = r6;
        this.A04 = r7;
        this.A0I = r21;
        this.A0C = r15;
        this.A0O = r24;
        this.A07 = r10;
        this.A0N = r29;
        this.A0E = r17;
        this.A0U = r25;
        this.A0L = r26;
        this.A0H = r20;
        this.A0R = r27;
        this.A00 = r3;
        this.A0D = r16;
        this.A09 = r12;
        this.A0B = r14;
        this.A0J = r22;
        this.A0K = r23;
        this.A0Q = r28;
        this.A01 = r4;
        this.A0G = r19;
        this.A0A = r13;
        this.A0M = r30;
        this.A06 = r9;
        this.A0P = r31;
        this.A0T = r32;
        this.A0S = r33;
    }
}
