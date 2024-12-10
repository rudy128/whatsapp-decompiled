package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.4lg  reason: invalid class name and case insensitive filesystem */
public class C95094lg implements C108445bi {
    public final AnonymousClass1c4 A00;
    public final AnonymousClass00H A01;
    public final C19880zA A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass18O A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    public Drawable BSc(Context context, C18000vb r3) {
        C18070vi.A0d(context, 0);
        return C24261Jm.A00(context, 2131231930);
    }

    public boolean CMC(Collection collection) {
        C18070vi.A0d(collection, 0);
        AnonymousClass1BI r1 = AnonymousClass3MX.A0s(collection).A0v.A00;
        if ((C22971Dz.A0e(r1) && C72463Mc.A1T(r1, this.A06)) || C22971Dz.A0S(r1)) {
            return false;
        }
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!((C32911hx) this.A05.get()).A01(C17880vN.A0Y(it))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0184, code lost:
        if (X.AnonymousClass25A.A0x(r12) != false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018e, code lost:
        if (X.AnonymousClass25A.A0m(r12) != false) goto L_0x0190;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f4, code lost:
        if (((X.C1179361n) r1.A01.get()).A05(r7) == false) goto L_0x01f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(android.app.Activity r24, java.util.Collection r25) {
        /*
            r23 = this;
            r3 = r24
            r1 = r23
            boolean r0 = r1 instanceof X.AnonymousClass3vd
            r7 = r25
            if (r0 == 0) goto L_0x00b4
            X.3vd r1 = (X.AnonymousClass3vd) r1
            r2 = 1
            X.206 r0 = X.AnonymousClass3MX.A0s(r7)
            X.205 r0 = r0.A0v
            X.1BI r9 = r0.A00
            boolean r0 = r9 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x0066
            java.util.Iterator r5 = r7.iterator()
        L_0x001d:
            boolean r0 = r5.hasNext()
            r6 = 0
            if (r0 == 0) goto L_0x0068
            java.lang.Object r8 = r5.next()
            r4 = r8
            X.206 r4 = (X.AnonymousClass206) r4
            boolean r0 = r4 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x001d
            X.21V r4 = (X.AnonymousClass21V) r4
            X.2rc r0 = r4.A02
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.A0V
            if (r0 != 0) goto L_0x001d
            if (r8 == 0) goto L_0x0068
            X.3Rj r5 = X.AnonymousClass4a6.A00(r3)
            android.content.res.Resources r4 = r3.getResources()
            r2 = 2131755056(0x7f100030, float:1.914098E38)
            int r0 = r7.size()
            java.lang.String r0 = r4.getQuantityString(r2, r0)
            r5.A0S(r0)
            r4 = 2131888536(0x7f120998, float:1.941171E38)
            r2 = 3
            X.4aw r0 = new X.4aw
            r0.<init>(r3, r1, r8, r2)
            r5.A0Z(r0, r4)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            r5.A0X(r6, r0)
            X.AnonymousClass3MY.A1G(r5)
        L_0x0066:
            r0 = 0
            return r0
        L_0x0068:
            X.1kb r0 = r1.A00
            X.1EC r9 = (X.AnonymousClass1EC) r9
            X.1EC r1 = r0.A05(r9)
            X.1FL r3 = (X.AnonymousClass1FL) r3
            X.1GP r0 = X.AnonymousClass3MX.A0O(r3)
            X.1jj r5 = new X.1jj
            r5.<init>(r0)
            com.whatsapp.conversation.ForwardMessagesRouter r4 = new com.whatsapp.conversation.ForwardMessagesRouter
            r4.<init>()
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.lang.String r1 = X.C72463Mc.A0n(r1)
            java.lang.String r0 = "parent_group"
            r3.putString(r0, r1)
            java.lang.String r0 = "entry_point"
            r3.putInt(r0, r2)
            java.util.ArrayList r2 = X.C29351c6.A0D(r7)
            java.util.Iterator r1 = r7.iterator()
        L_0x009a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a4
            X.C72463Mc.A1L(r2, r1)
            goto L_0x009a
        L_0x00a4:
            X.AnonymousClass4aU.A0C(r3, r2)
            r4.A1R(r3)
            java.lang.String r0 = "forward_messages_router"
            r5.A0B(r4, r0)
            r5.A04()
            r0 = 1
            return r0
        L_0x00b4:
            r8 = 0
            r2 = 1
            java.util.Iterator r6 = r7.iterator()
        L_0x00ba:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x012a
            X.206 r5 = X.C17880vN.A0Y(r6)
            boolean r0 = r5 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0115
            r0 = r5
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r0 = r0.A02
            if (r0 == 0) goto L_0x0115
            boolean r0 = r0.A0V
            if (r0 != 0) goto L_0x0115
            r0 = 4
            java.lang.Integer[] r4 = new java.lang.Integer[r0]
            X.C17880vN.A1T(r4, r0, r8)
            r0 = 5
            X.C17880vN.A1T(r4, r0, r2)
            r0 = 14
            X.AnonymousClass3Ma.A1S(r4, r0)
            r0 = 30
            X.C17890vO.A1G(r4, r0)
            java.util.Set r4 = X.C200410p.A0S(r4)
            int r0 = r5.A0u
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0115
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0115
            X.18O r4 = r1.A04
            X.18R r0 = X.AnonymousClass18O.A0P
            boolean r0 = r4.A09(r0)
            if (r0 != 0) goto L_0x0115
            java.lang.String r0 = "ForwardSelectionAction/execute unfinished-upload"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1KB r1 = r1.A03
            r0 = 2131892045(0x7f12174d, float:1.9418827E38)
        L_0x0111:
            r1.A08(r0, r8)
            return r8
        L_0x0115:
            int r4 = r5.A0u
            r0 = 8
            if (r4 == r0) goto L_0x011f
            r0 = 10
            if (r4 != r0) goto L_0x00ba
        L_0x011f:
            java.lang.String r0 = "ForwardSelectionAction/execute failed call"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.1KB r1 = r1.A03
            r0 = 2131892044(0x7f12174c, float:1.9418825E38)
            goto L_0x0111
        L_0x012a:
            java.util.HashSet r11 = X.C17880vN.A12()
            java.util.ArrayList r22 = X.AnonymousClass000.A13()
            java.lang.Object r0 = X.C29431cG.A0Y(r7)
            X.206 r0 = (X.AnonymousClass206) r0
            if (r0 == 0) goto L_0x01d0
            X.205 r0 = r0.A0v
            if (r0 == 0) goto L_0x01d0
            X.1BI r10 = r0.A00
        L_0x0140:
            java.util.Iterator r17 = r7.iterator()
            r20 = 0
            r16 = 1
            r9 = 0
            r15 = 0
            r14 = 0
            r13 = 0
            r6 = 0
        L_0x014d:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01d3
            X.206 r12 = X.C17880vN.A0Y(r17)
            int r5 = r12.A0u
            X.C17890vO.A1D(r11, r5)
            X.205 r4 = r12.A0v
            X.C18070vi.A0W(r4)
            r0 = r22
            r0.add(r4)
            X.1BI r0 = r4.A00
            if (r9 != 0) goto L_0x01c8
            r9 = r0
        L_0x016b:
            r0 = 3
            if (r5 != r0) goto L_0x019e
            r0 = r12
            X.21V r0 = (X.AnonymousClass21V) r0
            int r0 = r0.A0D
            long r4 = X.C17890vO.A03(r0)
            int r0 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r0 <= 0) goto L_0x017d
            r20 = r4
        L_0x017d:
            if (r15 != 0) goto L_0x0186
            boolean r0 = X.AnonymousClass25A.A0x(r12)
            r15 = 0
            if (r0 == 0) goto L_0x0187
        L_0x0186:
            r15 = 1
        L_0x0187:
            if (r13 != 0) goto L_0x0190
            boolean r0 = X.AnonymousClass25A.A0m(r12)
            r13 = 0
            if (r0 == 0) goto L_0x0191
        L_0x0190:
            r13 = 1
        L_0x0191:
            if (r14 != 0) goto L_0x019c
            r4 = 1
            boolean r0 = r12.A11(r4)
            r14 = 0
            if (r0 == 0) goto L_0x014d
        L_0x019c:
            r14 = 1
            goto L_0x014d
        L_0x019e:
            r0 = 2
            if (r5 != r0) goto L_0x01ad
            int r0 = r12.A09
            if (r0 != r2) goto L_0x01aa
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x01aa
            goto L_0x017d
        L_0x01aa:
            r16 = 0
            goto L_0x017d
        L_0x01ad:
            if (r5 != 0) goto L_0x017d
            java.lang.String r0 = r12.A0P()
            X.C18070vi.A0b(r0)
            int r0 = r0.length()
            if (r0 <= r6) goto L_0x017d
            java.lang.String r0 = r12.A0P()
            X.C18070vi.A0b(r0)
            int r6 = r0.length()
            goto L_0x017d
        L_0x01c8:
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x016b
            r9 = 0
            goto L_0x016b
        L_0x01d0:
            r10 = 0
            goto L_0x0140
        L_0x01d3:
            java.util.Iterator r4 = r7.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01f6
            X.206 r0 = X.C17880vN.A0Y(r4)
            boolean r0 = r0.A0w()
            if (r0 == 0) goto L_0x01f6
            X.00H r0 = r1.A01
            java.lang.Object r0 = r0.get()
            X.61n r0 = (X.C1179361n) r0
            boolean r0 = r0.A05(r7)
            r4 = 1
            if (r0 != 0) goto L_0x01f7
        L_0x01f6:
            r4 = 0
        L_0x01f7:
            boolean r0 = X.C22971Dz.A0V(r10)
            if (r0 == 0) goto L_0x029b
            r5 = 26
        L_0x01ff:
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r2)
            r0 = 0
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r8)
            if (r15 == 0) goto L_0x020e
            int r0 = r7.size()
        L_0x020e:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r14)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r13)
            java.util.ArrayList r17 = X.C17880vN.A10(r11)
            java.lang.Long r12 = java.lang.Long.valueOf(r20)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r16)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            X.1c4 r0 = r1.A00
            boolean r16 = X.C22971Dz.A0V(r9)
            X.0ve r15 = r0.A02
            r14 = 12343(0x3037, float:1.7296E-41)
            X.0vf r13 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r13, r15, r14)
            r0 = 2
            if (r1 == r0) goto L_0x0249
            if (r16 == 0) goto L_0x0298
            int r0 = X.C18020vd.A00(r13, r15, r14)
            if (r0 != r2) goto L_0x0298
        L_0x0249:
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPickerBottomSheetActivity"
        L_0x024b:
            android.content.Intent r5 = X.C72483Me.A0B(r3, r0, r5)
            r1 = r17
            r0 = r19
            X.C72483Me.A0h(r5, r9, r1, r0)
            if (r12 == 0) goto L_0x025d
            java.lang.String r0 = "forward_video_duration"
            r5.putExtra(r0, r12)
        L_0x025d:
            if (r11 == 0) goto L_0x0264
            java.lang.String r0 = "forward_text_length"
            r5.putExtra(r0, r11)
        L_0x0264:
            if (r10 == 0) goto L_0x026b
            java.lang.String r0 = "forward_messages_becoming_frequently_forwarded"
            r5.putExtra(r0, r10)
        L_0x026b:
            if (r8 == 0) goto L_0x0272
            java.lang.String r0 = "is_forwarded"
            r5.putExtra(r0, r8)
        L_0x0272:
            if (r7 == 0) goto L_0x0279
            java.lang.String r0 = "forward_highly_forwarded"
            r5.putExtra(r0, r7)
        L_0x0279:
            if (r6 == 0) goto L_0x0280
            java.lang.String r0 = "is_voice_status_forward_allowed"
            r5.putExtra(r0, r6)
        L_0x0280:
            r0 = r22
            X.AnonymousClass4aU.A08(r5, r0)
            java.lang.String r1 = "show_ad_creation"
            r0 = r18
            r5.putExtra(r1, r0)
            if (r4 == 0) goto L_0x0293
            java.lang.String r0 = "disable_text_size_limit_message"
            r5.putExtra(r0, r4)
        L_0x0293:
            r0 = 2
            r3.startActivityForResult(r5, r0)
            return r2
        L_0x0298:
            java.lang.String r0 = "com.whatsapp.contact.picker.ContactPicker"
            goto L_0x024b
        L_0x029b:
            boolean r0 = X.C22971Dz.A0e(r10)
            if (r0 == 0) goto L_0x02a5
            r5 = 91
            goto L_0x01ff
        L_0x02a5:
            boolean r0 = X.C22971Dz.A0d(r10)
            r5 = 1
            if (r0 == 0) goto L_0x01ff
            r5 = 4
            goto L_0x01ff
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95094lg.A00(android.app.Activity, java.util.Collection):boolean");
    }

    public boolean BRj() {
        return false;
    }

    public int getId() {
        return 8;
    }

    public C95094lg(C19880zA r1, AnonymousClass1KB r2, AnonymousClass18O r3, AnonymousClass1c4 r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r2, r3, r4, r5, r6);
        C18070vi.A0l(r1, r7);
        this.A03 = r2;
        this.A04 = r3;
        this.A00 = r4;
        this.A06 = r5;
        this.A01 = r6;
        this.A02 = r1;
        this.A05 = r7;
    }

    public String BaW(C108015az r3) {
        return C18070vi.A0F(C72463Mc.A0E(r3), 2131889000);
    }
}
