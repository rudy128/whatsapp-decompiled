package X;

import com.whatsapp.unity.UnityTranscriptionListener;
import java.util.List;

/* renamed from: X.DQu  reason: case insensitive filesystem */
public final class C27049DQu implements UnityTranscriptionListener {
    public int A00;
    public final C441822l A01;
    public final StringBuilder A02 = AnonymousClass000.A10();
    public final List A03 = AnonymousClass000.A13();
    public final /* synthetic */ C25209Cb3 A04;
    public final /* synthetic */ E8I A05;

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        if (r3 == null) goto L_0x00a9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onComplete(java.util.Map r10) {
        /*
            r9 = this;
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            java.lang.StringBuilder r0 = r9.A02
            java.lang.String r4 = X.C18070vi.A0H(r0)
            java.util.Iterator r7 = X.AnonymousClass000.A15(r10)
            boolean r0 = r7.hasNext()
            r5 = 0
            if (r0 != 0) goto L_0x004e
            r6 = r5
        L_0x0016:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            if (r6 == 0) goto L_0x00a9
            java.lang.String r5 = X.C17880vN.A0x(r6)
            if (r5 == 0) goto L_0x00a9
            r0 = 1
            char[] r8 = new char[r0]
            r7 = 0
            r0 = 95
            r8[r7] = r0
            r0 = 1
            int r6 = r5.length()
            int r6 = r6 - r0
            r3 = 0
            r2 = 0
        L_0x0030:
            if (r3 > r6) goto L_0x0081
            r0 = r6
            if (r2 != 0) goto L_0x0036
            r0 = r3
        L_0x0036:
            char r1 = r5.charAt(r0)
            char r0 = r8[r7]
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            if (r2 != 0) goto L_0x0049
            if (r0 != 0) goto L_0x0046
            r2 = 1
            goto L_0x0030
        L_0x0046:
            int r3 = r3 + 1
            goto L_0x0030
        L_0x0049:
            if (r0 == 0) goto L_0x0081
            int r6 = r6 + -1
            goto L_0x0030
        L_0x004e:
            java.lang.Object r6 = r7.next()
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0016
            r0 = r6
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            float r3 = X.AnonymousClass000.A04(r0)
        L_0x0063:
            java.lang.Object r2 = r7.next()
            r0 = r2
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            float r1 = X.AnonymousClass000.A04(r0)
            int r0 = java.lang.Float.compare(r3, r1)
            if (r0 >= 0) goto L_0x007a
            r6 = r2
            r3 = r1
        L_0x007a:
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0063
            goto L_0x0016
        L_0x0081:
            int r0 = r6 + 1
            java.lang.CharSequence r0 = r5.subSequence(r3, r0)
            java.lang.String r7 = r0.toString()
            if (r7 == 0) goto L_0x00a9
            X.Bzn[] r6 = X.C24352Bzn.values()
            int r3 = r6.length
            r2 = 0
        L_0x0093:
            if (r2 >= r3) goto L_0x00a9
            r1 = r6[r2]
            java.lang.String r0 = r1.value
            boolean r0 = X.C18070vi.A18(r0, r7)
            if (r0 == 0) goto L_0x00be
            X.0vl r0 = X.C24352Bzn.A00
            java.lang.Object r3 = X.AnonymousClass8BV.A0n(r1, r0)
            X.Cho r3 = (X.C25550Cho) r3
            if (r3 != 0) goto L_0x00b4
        L_0x00a9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voicetranscription/engines/UnityTranscriptionEngine/transcribe: unrecognized language "
            X.C17900vP.A0e(r0, r5, r1)
            X.BvR r3 = X.C24099BvR.A00
        L_0x00b4:
            X.E8I r2 = r9.A05
            X.22l r1 = r9.A01
            java.util.List r0 = r9.A03
            r2.C99(r3, r1, r4, r0)
            return
        L_0x00be:
            int r2 = r2 + 1
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27049DQu.onComplete(java.util.Map):void");
    }

    public void onSegmentResult(String str, float f, int i) {
        int i2 = i;
        C18070vi.A0d(str, 0);
        StringBuilder sb = this.A02;
        if (sb.length() != 0) {
            BE6.A1J(sb);
        }
        sb.append(str);
        List list = this.A03;
        int i3 = this.A00;
        int length = str.length();
        int A012 = C22339B3q.A01(f * 100.0f);
        if (A012 < 0) {
            A012 = 0;
        } else if (A012 > 100) {
            A012 = 100;
        }
        if (i < 0) {
            i2 = -1;
        }
        list.add(new C135966t3(i3, length, A012, i2, -1));
        this.A00 += length + 1;
    }

    public C27049DQu(C25209Cb3 cb3, E8I e8i) {
        this.A04 = cb3;
        this.A05 = e8i;
        this.A01 = cb3.A01;
    }

    /* JADX WARNING: type inference failed for: r2v7, types: [X.CM2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onError(int r4) {
        /*
            r3 = this;
            switch(r4) {
                case 1: goto L_0x0033;
                case 2: goto L_0x0036;
                case 3: goto L_0x0039;
                case 4: goto L_0x003c;
                case 5: goto L_0x003f;
                case 6: goto L_0x0042;
                default: goto L_0x0003;
            }
        L_0x0003:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voicetranscription/engines/UnityTranscriptionEngine/onError unknown unity.cpp errorCode "
            X.C17900vP.A0i(r0, r1, r4)
            r0 = 1
            X.BvT r2 = new X.BvT
            r2.<init>(r0)
        L_0x0012:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voicetranscription/engines/UnityTranscriptionEngine/onError unityErrorCode="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; status="
            r1.append(r0)
            int r0 = r2.A00
            r1.append(r0)
            X.C17890vO.A0w(r1)
            X.E8I r1 = r3.A05
            X.22l r0 = r3.A01
            r1.C98(r2, r0)
            return
        L_0x0033:
            X.BvX r2 = X.C24105BvX.A00
            goto L_0x0012
        L_0x0036:
            X.Bvd r2 = X.C24111Bvd.A00
            goto L_0x0012
        L_0x0039:
            X.Bvc r2 = X.C24110Bvc.A00
            goto L_0x0012
        L_0x003c:
            X.Bvb r2 = X.C24109Bvb.A00
            goto L_0x0012
        L_0x003f:
            X.Bvi r2 = X.C24116Bvi.A00
            goto L_0x0012
        L_0x0042:
            X.BvW r2 = X.C24104BvW.A00
            goto L_0x0012
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27049DQu.onError(int):void");
    }

    public void onTimingReceived(int i, double d) {
        for (C24338BzZ bzZ : C24338BzZ.values()) {
            if (bzZ.value == i) {
                this.A04.A03.invoke(bzZ, Double.valueOf(d));
                return;
            }
        }
        C17900vP.A0i("voicetranscription/engines/UnityTranscriptionEngine/onTimingReceived: unknown phaseId ", AnonymousClass000.A10(), i);
    }
}
