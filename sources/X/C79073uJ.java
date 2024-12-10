package X;

import android.content.Context;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.LinearLayout;
import com.whatsapp.stickers.StickerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3uJ  reason: invalid class name and case insensitive filesystem */
public class C79073uJ extends C78473sr implements C108405be {
    public C219217x A00;
    public C32861hs A01;
    public C32431hB A02;
    public C26631Sw A03;
    public C50522Ut A04;
    public AnonymousClass00H A05;
    public List A06;
    public final View A07 = AnonymousClass1HF.A06(this, 2131428460);
    public final View A08 = AnonymousClass1HF.A06(this, 2131429616);
    public final ArrayList A09;

    public void A1u() {
        A01(false);
        AnonymousClass3uP.A0h(this, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r5 == 100) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1y() {
        /*
            r8 = this;
            r7 = 0
        L_0x0001:
            java.util.ArrayList r1 = r8.A09
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x006d
            java.util.List r0 = r8.A06
            int r0 = r0.size()
            if (r7 >= r0) goto L_0x0068
            java.lang.Object r0 = r1.get(r7)
            X.4XZ r0 = (X.AnonymousClass4XZ) r0
            X.73a r0 = r0.A09
            X.1bI r6 = r0.A0I
            java.util.List r0 = r8.A06
            java.lang.Object r0 = r0.get(r7)
            X.21V r0 = (X.AnonymousClass21V) r0
            X.2rc r1 = X.AnonymousClass206.A00(r0)
            boolean r0 = r1.A0f
            if (r0 == 0) goto L_0x006b
            boolean r0 = r1.A0d
            if (r0 != 0) goto L_0x006b
            long r0 = r1.A0C
            int r2 = (int) r0
            X.1hs r1 = r8.A01
            java.util.List r0 = r8.A06
            java.lang.Object r0 = r0.get(r7)
            X.21V r0 = (X.AnonymousClass21V) r0
            boolean r0 = r1.A08(r0)
            int r5 = r2 / 2
            if (r0 == 0) goto L_0x0046
            int r5 = r5 + 50
        L_0x0046:
            if (r5 == 0) goto L_0x004d
            r0 = 100
            r4 = 0
            if (r5 != r0) goto L_0x004e
        L_0x004d:
            r4 = 1
        L_0x004e:
            int r3 = r8.A2i(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            X.C17900vP.A0a(r8, r1)
            java.lang.String r0 = "#updateProgress"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            r1 = 1
            X.4qn r0 = new X.4qn
            r0.<init>(r5, r3, r1, r4)
            r6.A08(r0, r2)
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x0001
        L_0x006b:
            r5 = 0
            goto L_0x004d
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79073uJ.A1y():void");
    }

    public boolean A2Y() {
        return false;
    }

    public boolean A2Z() {
        return false;
    }

    public /* synthetic */ void CKk() {
    }

    public int getCapabilities() {
        return 0;
    }

    public int getMainChildMaxWidth() {
        return 0;
    }

    public int getMaxAlbumSize() {
        return 2;
    }

    public int getMinAlbumSize() {
        return 2;
    }

    private void A00() {
        if (this.A06 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A09;
                if (i < arrayList.size()) {
                    if (i < this.A06.size()) {
                        AnonymousClass4XZ r3 = (AnonymousClass4XZ) arrayList.get(i);
                        C108875cR r2 = r3.A0D.A0k;
                        if (r2 == null || !r2.Bcq()) {
                            C72453Mb.A1B(r3.A02);
                        } else {
                            AnonymousClass4XZ.A00(r3);
                            r3.A02.setSelected(r2.Bfa(r3.A07));
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private void A01(boolean z) {
        AnonymousClass21V r0;
        if (this.A06 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A09;
                if (i < arrayList.size()) {
                    int size = this.A06.size();
                    AnonymousClass4XZ r1 = (AnonymousClass4XZ) arrayList.get(i);
                    if (i < size) {
                        r0 = (AnonymousClass21V) this.A06.get(i);
                    } else {
                        r0 = null;
                    }
                    r1.A01(r0, z);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void A1S() {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            AnonymousClass4XZ r2 = (AnonymousClass4XZ) it.next();
            StickerView stickerView = r2.A0A;
            stickerView.clearAnimation();
            r2.A00 = 0.0f;
            stickerView.invalidate();
        }
    }

    public void A1T(AnonymousClass205 r5) {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            AnonymousClass4XZ r1 = (AnonymousClass4XZ) it.next();
            if (r5.equals(r1.A07.A0v)) {
                StickerView stickerView = r1.A0A;
                stickerView.setBackgroundDrawable(new AnonymousClass3N9(r1));
                AnonymousClass3OP r2 = new AnonymousClass3OP(r1);
                r2.setDuration(2400);
                r2.setInterpolator(new AccelerateInterpolator());
                stickerView.startAnimation(r2);
                return;
            }
        }
    }

    public boolean A1X() {
        return C79103uS.A1K(this, this.A0I, this.A1h);
    }

    public void A2O(AnonymousClass206 r5) {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            AnonymousClass4XZ r3 = (AnonymousClass4XZ) it.next();
            AnonymousClass21V r0 = r3.A07;
            if (r0 != null && r5.A0v.equals(r0.A0v)) {
                C108875cR r2 = r3.A0D.A0k;
                if (r2 != null && r2.Bcq()) {
                    r3.A02.setSelected(r2.CPY(r3.A07));
                    return;
                }
                return;
            }
        }
    }

    public void A2S(AnonymousClass206 r5, int i) {
        if (r5 instanceof AnonymousClass21V) {
            Iterator it = this.A09.iterator();
            while (it.hasNext()) {
                AnonymousClass4XZ r2 = (AnonymousClass4XZ) it.next();
                AnonymousClass21V r0 = r2.A07;
                if (r0 != null && r5.A0v.equals(r0.A0v)) {
                    r2.A01 = i;
                    r2.A01((AnonymousClass21V) r5, false);
                    return;
                }
            }
        }
    }

    public void A2V(AnonymousClass206 r2, boolean z) {
        super.A2V(this.A0I, z);
        if (z) {
            A01(false);
        }
        A00();
    }

    public boolean A2h(AnonymousClass205 r4) {
        List list = this.A06;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (AnonymousClass3MZ.A10(it).equals(r4)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r5.A0I != r6.get(0)) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2k(java.util.List r6, boolean r7) {
        /*
            r5 = this;
            java.util.List r0 = r5.A06
            r4 = 0
            if (r0 == 0) goto L_0x000e
            X.206 r1 = r5.A0I
            java.lang.Object r0 = r6.get(r4)
            r3 = 0
            if (r1 == r0) goto L_0x000f
        L_0x000e:
            r3 = 1
        L_0x000f:
            int r1 = r6.size()
            r0 = 2
            if (r1 == r0) goto L_0x001c
            java.lang.String r0 = "ConversationRowStickerAlbum/setAlbumMessages improper number of stickers in sticker album"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x001c:
            if (r7 != 0) goto L_0x0039
            java.util.List r0 = r5.A06
            if (r0 == 0) goto L_0x0038
            r2 = 0
        L_0x0023:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x0039
            java.util.List r0 = r5.A06
            java.lang.Object r1 = r0.get(r2)
            java.lang.Object r0 = r6.get(r2)
            if (r1 != r0) goto L_0x0038
            int r2 = r2 + 1
            goto L_0x0023
        L_0x0038:
            r7 = 1
        L_0x0039:
            r5.A06 = r6
            X.206 r0 = X.AnonymousClass3MW.A0k(r6, r4)
            super.A2V(r0, r7)
            if (r3 != 0) goto L_0x0046
            if (r7 == 0) goto L_0x0049
        L_0x0046:
            r5.A01(r3)
        L_0x0049:
            r5.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79073uJ.A2k(java.util.List, boolean):void");
    }

    public boolean Be6() {
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if ((A0Y instanceof C441322g) && ((C441322g) A0Y).A03) {
                return true;
            }
        }
        return false;
    }

    public void CNi() {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            ((AnonymousClass4XZ) it.next()).A0A.A07();
        }
    }

    public void COV() {
        Iterator it = this.A09.iterator();
        while (it.hasNext()) {
            ((AnonymousClass4XZ) it.next()).A0A.A08();
        }
    }

    public C82854Ci getBubbleType() {
        boolean A0R = this.A0E.A0R(AnonymousClass3MW.A0k(this.A06, 0).A0v.A00);
        if (!C22971Dz.A0f(AnonymousClass3MW.A0k(this.A06, 0)) || (AnonymousClass3MW.A0k(this.A06, 0).A0v.A02 && !A0R)) {
            return C82854Ci.NONE;
        }
        return C82854Ci.CONTACT;
    }

    public AnonymousClass21V getFMessage() {
        return (AnonymousClass21V) this.A0I;
    }

    public int getMessageCount() {
        return C72463Mc.A0C(this.A06);
    }

    public C79073uJ(Context context, C108875cR r5, AnonymousClass21V r6, C26631Sw r7) {
        super(context, r5, r6);
        A1M();
        A1M();
        ArrayList A13 = AnonymousClass000.A13();
        this.A09 = A13;
        this.A03 = r7;
        A13.add(new AnonymousClass4XZ((LinearLayout) findViewById(2131435721), this));
        A13.add(new AnonymousClass4XZ((LinearLayout) findViewById(2131435722), this));
    }

    public int getReactionsViewVerticalOverlap() {
        return C72463Mc.A08(this);
    }

    public int getCenteredLayoutId() {
        return 2131624923;
    }

    public int getIncomingLayoutId() {
        return 2131624923;
    }

    public int getOutgoingLayoutId() {
        return 2131624924;
    }
}
