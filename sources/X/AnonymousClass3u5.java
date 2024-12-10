package X;

import android.content.Context;
import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3u5  reason: invalid class name */
public final class AnonymousClass3u5 extends C78993u6 {
    public C32251gt A00;
    public C52932bi A01;
    public AnonymousClass1D6 A02;
    public final C108875cR A03;
    public final WaTextView A04 = AnonymousClass3MW.A0U(this, 2131436517);
    public final C28931bI A05 = C28931bI.A00(this, 2131428830);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3u5(Context context, AnonymousClass247 r7, C108875cR r8) {
        super(context, r8, r7);
        C18070vi.A0e(context, 1, r7);
        A1M();
        this.A03 = r8;
        this.A18.A09(new AnonymousClass7RF(this, r7, 30, true), new AnonymousClass25F[]{r7.A04});
    }

    public boolean A2h(AnonymousClass205 r3) {
        C18070vi.A0d(r3, 0);
        ArrayList A17 = getFMessage().A17();
        if (!(A17 instanceof Collection) || !A17.isEmpty()) {
            Iterator it = A17.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C18070vi.A18(AnonymousClass3MZ.A10(it), r3)) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (r3.equals(getFMessage().A0v)) {
            return true;
        }
        return false;
    }

    public boolean A2m() {
        return true;
    }

    public int getMessageCount() {
        return 1;
    }

    public void setAlbumMessages(List list) {
    }

    public final void setAlbumNotificationManager(C32251gt r2) {
        C18070vi.A0d(r2, 0);
        this.A00 = r2;
    }

    public final void setAlbumUnreadMessagesManager(C52932bi r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    public void setFMessage(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        C17960vV.A0H(r4 instanceof AnonymousClass247, AnonymousClass001.A1E(r4, "Expected a message of type FMessageAlbum but instead found ", AnonymousClass000.A10()));
        this.A0I = r4;
    }

    public boolean A1V() {
        if (!((C32911hx) this.A1y.get()).A01(getFMessage()) || !this.A0l.CMI()) {
            return false;
        }
        return true;
    }

    public final C32251gt getAlbumNotificationManager() {
        C32251gt r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("albumNotificationManager");
        throw null;
    }

    public final C52932bi getAlbumUnreadMessagesManager() {
        C52932bi r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("albumUnreadMessagesManager");
        throw null;
    }

    public AnonymousClass247 getFMessage() {
        AnonymousClass206 r1 = this.A0I;
        C18070vi.A0z(r1, "null cannot be cast to non-null type com.whatsapp.album.fmessage.FMessageAlbum");
        return (AnonymousClass247) r1;
    }

    public final C108875cR getRowsContainer() {
        return this.A03;
    }

    private final boolean A00() {
        if ((!getFMessage().A17().isEmpty()) || getFMessage().A02 > 0 || getFMessage().A03 > 0) {
            return true;
        }
        return false;
    }

    public void A2V(AnonymousClass206 r7, boolean z) {
        boolean z2 = !C18070vi.A18(r7, getFMessage());
        super.A2V(r7, z);
        if (z || z2) {
            AnonymousClass247 fMessage = getFMessage();
            this.A18.A09(new AnonymousClass7RF(this, fMessage, 30, z2), new AnonymousClass25F[]{fMessage.A04});
        }
    }

    public boolean A2e(AnonymousClass206 r5) {
        ArrayList A17 = getFMessage().A17();
        if (!(A17 instanceof Collection) || !A17.isEmpty()) {
            Iterator it = A17.iterator();
            while (it.hasNext()) {
                if (C18070vi.A18(AnonymousClass3MZ.A10(it), r5.A0v)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        if (X.C18020vd.A05(r6, r13.A0F, 11665) == false) goto L_0x008e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2l(boolean r14) {
        /*
            r13 = this;
            boolean r1 = r13.A00()
            r5 = 8
            android.view.View r0 = r13.A0j
            if (r1 == 0) goto L_0x0100
            r3 = 0
            r0.setVisibility(r3)
            super.A2l(r14)
            X.0ve r1 = r13.A0F
            r0 = 11798(0x2e16, float:1.6533E-41)
            X.0vf r6 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 != 0) goto L_0x0024
            X.1bI r0 = r13.A05
            if (r0 == 0) goto L_0x0024
            r0.A02()
        L_0x0024:
            X.0ve r1 = r13.A0F
            r0 = 11943(0x2ea7, float:1.6736E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)
            if (r0 == 0) goto L_0x0065
            X.247 r0 = r13.getFMessage()
            java.util.ArrayList r0 = r0.A17()
            java.util.Iterator r1 = r0.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x004e
            java.lang.Object r2 = r1.next()
            r0 = r2
            X.21V r0 = (X.AnonymousClass21V) r0
            java.lang.String r0 = r0.A18()
            if (r0 == 0) goto L_0x003a
        L_0x004e:
            X.21V r2 = (X.AnonymousClass21V) r2
            X.1bI r0 = r13.A05
            if (r2 == 0) goto L_0x00f9
            if (r0 == 0) goto L_0x0065
            android.view.View r1 = X.AnonymousClass3MY.A0I(r0, r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0065
            java.lang.String r0 = r2.A18()
            r1.setText(r0)
        L_0x0065:
            X.247 r0 = r13.getFMessage()
            long r1 = r0.A0G
            X.1D6 r0 = r13.A02
            if (r0 == 0) goto L_0x008e
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x008e
            X.11P r0 = r13.A0u
            long r3 = X.AnonymousClass11P.A01(r0)
            long r3 = r3 - r1
            r1 = 120000(0x1d4c0, double:5.9288E-319)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x008e
            X.0ve r1 = r13.A0F
            r0 = 11665(0x2d91, float:1.6346E-41)
            boolean r1 = X.C18020vd.A05(r6, r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x008f
        L_0x008e:
            r0 = 0
        L_0x008f:
            com.whatsapp.WaTextView r7 = r13.A04
            if (r7 == 0) goto L_0x00c4
            if (r0 == 0) goto L_0x0096
            r5 = 0
        L_0x0096:
            r7.setVisibility(r5)
            X.1D6 r1 = r13.A02
            if (r1 == 0) goto L_0x00c4
            if (r0 == 0) goto L_0x00c4
            android.content.Context r10 = X.AnonymousClass3MY.A04(r7)
            X.0vb r2 = r7.getWhatsAppLocale()
            java.lang.Object r0 = r1.first
            long r5 = X.C17880vN.A05(r0)
            java.lang.Object r0 = r1.second
            long r3 = X.C17880vN.A05(r0)
            r8 = 0
            r9 = 1
            r11 = 0
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00c5
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00c5
            java.lang.String r0 = ""
        L_0x00c1:
            r7.setText(r0)
        L_0x00c4:
            return
        L_0x00c5:
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00d9
            r1 = 2131755296(0x7f100120, float:1.9141467E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.AnonymousClass3MX.A1S(r0, r8, r5)
            java.lang.String r0 = r2.A0K(r0, r1, r5)
        L_0x00d5:
            X.C18070vi.A0X(r0)
            goto L_0x00c1
        L_0x00d9:
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x00ea
            r1 = 2131755297(0x7f100121, float:1.914147E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.AnonymousClass3MX.A1S(r0, r8, r3)
            java.lang.String r0 = r2.A0K(r0, r1, r3)
            goto L_0x00d5
        L_0x00ea:
            r2 = 2131893095(0x7f121b67, float:1.9420957E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            long r5 = r5 + r3
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            java.lang.String r0 = X.C17880vN.A0q(r10, r0, r1, r8, r2)
            goto L_0x00d5
        L_0x00f9:
            if (r0 == 0) goto L_0x0065
            r0.A04(r5)
            goto L_0x0065
        L_0x0100:
            r0.setVisibility(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3u5.A2l(boolean):void");
    }

    public List getAlbumMessages() {
        return getFMessage().A17();
    }

    public List getAllMessages() {
        return getFMessage().A17();
    }

    public int getMessageStatus() {
        Iterator it = getFMessage().A17().iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            int A0D = C17880vN.A0Y(it).A0D();
            if (C446824j.A03(A0D, 4)) {
                z = true;
            } else if (C446824j.A03(A0D, 5)) {
                z2 = true;
            } else if (C446824j.A03(A0D, 13)) {
                z3 = true;
            }
        }
        if (z) {
            return 0;
        }
        if (z2) {
            return 4;
        }
        if (z3) {
            return 5;
        }
        return 13;
    }

    public List getParentAndChildMessages() {
        return C29431cG.A0k(getFMessage().A17(), C18070vi.A0M(getFMessage()));
    }

    public List getRevokedAlbumMessages() {
        return getFMessage().A18();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.A02 != null) {
            C52932bi albumUnreadMessagesManager = getAlbumUnreadMessagesManager();
            AnonymousClass247 fMessage = getFMessage();
            C18070vi.A0d(fMessage, 0);
            AnonymousClass1BI r0 = fMessage.A0v.A00;
            if (r0 != null) {
                HashMap hashMap = albumUnreadMessagesManager.A01;
                synchronized (hashMap) {
                    ArrayList arrayList = (ArrayList) hashMap.get(r0);
                    if (arrayList != null) {
                        C29401cD.A0N(arrayList, new AnonymousClass3IC(fMessage));
                    }
                }
            }
            this.A02 = null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (A00()) {
            super.onLayout(z, i, i2, i3, i4);
        } else {
            this.A0j.layout(0, 0, 0, 0);
        }
    }

    public void onMeasure(int i, int i2) {
        if (A00()) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public int getCenteredLayoutId() {
        return 2131624764;
    }

    public int getIncomingLayoutId() {
        return 2131624764;
    }

    public int getOutgoingLayoutId() {
        return 2131624765;
    }
}
