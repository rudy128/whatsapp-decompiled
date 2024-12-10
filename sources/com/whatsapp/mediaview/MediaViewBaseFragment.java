package com.whatsapp.mediaview;

import X.A1M;
import X.AnonymousClass000;
import X.AnonymousClass01E;
import X.AnonymousClass112;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass21V;
import X.AnonymousClass2QJ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4ZR;
import X.AnonymousClass65h;
import X.AnonymousClass6A8;
import X.AnonymousClass6A9;
import X.AnonymousClass745;
import X.AnonymousClass74O;
import X.AnonymousClass77G;
import X.AnonymousClass78K;
import X.AnonymousClass7RT;
import X.AnonymousClass8AR;
import X.C003401n;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C114595rJ;
import X.C1188565n;
import X.C132146mH;
import X.C1402270m;
import X.C1425779z;
import X.C144467Hk;
import X.C1600787a;
import X.C160898Aj;
import X.C17890vO;
import X.C17960vV;
import X.C18030ve;
import X.C18070vi;
import X.C19740yt;
import X.C20287AEv;
import X.C219217x;
import X.C22891Dp;
import X.C23301Fm;
import X.C28931bI;
import X.C29261bv;
import X.C33321id;
import X.C37891qK;
import X.C72453Mb;
import X.C72463Mc;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.base.WaFragment;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment;
import com.whatsapp.components.InsetsDrawingView;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;

public abstract class MediaViewBaseFragment extends WaFragment implements C1600787a {
    public Bundle A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public TextView A05;
    public TextEmojiLabel A06;
    public InsetsDrawingView A07;
    public C114595rJ A08;
    public AnonymousClass65h A09;
    public C1600787a A0A;
    public AnonymousClass745 A0B;
    public C28931bI A0C;
    public C132146mH A0D;
    public Runnable A0E;
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public boolean A0I = true;
    public boolean A0J = false;
    public OutOfMemoryError A0K;

    public PhotoView A27(ViewGroup viewGroup) {
        PhotoView A27;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof PhotoView) {
                return (PhotoView) childAt;
            }
            if ((childAt instanceof ViewGroup) && (A27 = A27((ViewGroup) childAt)) != null) {
                return A27;
            }
        }
        return null;
    }

    public PhotoView A28(Object obj) {
        if (obj != null) {
            View findViewWithTag = this.A09.findViewWithTag(obj);
            if (findViewWithTag instanceof ViewGroup) {
                return A27((ViewGroup) findViewWithTag);
            }
        }
        return null;
    }

    public void A2J(boolean z) {
        A2L(z, true);
    }

    public static void A00(Activity activity) {
        if (AnonymousClass745.A00) {
            Window window = activity.getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
        }
    }

    public void A1r() {
        if (this.A09 != null) {
            for (int i = 0; i < this.A09.getChildCount(); i++) {
                View childAt = this.A09.getChildAt(i);
                if (childAt instanceof FrameLayout) {
                    int i2 = 0;
                    while (true) {
                        ViewGroup viewGroup = (ViewGroup) childAt;
                        if (i2 >= viewGroup.getChildCount()) {
                            break;
                        }
                        View childAt2 = viewGroup.getChildAt(i2);
                        if (childAt2 instanceof PhotoView) {
                            ((PhotoView) childAt2).A09();
                        }
                        i2++;
                    }
                }
            }
        }
        super.A1r();
    }

    public void A1s() {
        this.A04.removeView(this.A09);
        this.A04 = null;
        this.A03 = null;
        this.A06 = null;
        this.A05 = null;
        this.A01 = null;
        this.A02 = null;
        this.A07 = null;
        super.A1s();
    }

    public C18030ve A26() {
        if (this instanceof MediaViewFragment) {
            return ((MediaViewFragment) this).A0e;
        }
        if (this instanceof LinkedAccountMediaViewFragment) {
            return ((LinkedAccountMediaViewFragment) this).A0C;
        }
        C18030ve r0 = ((CatalogMediaViewFragment) this).A0A;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("props");
        throw null;
    }

    public Object A29() {
        if (this instanceof MediaViewFragment) {
            AnonymousClass21V r0 = ((MediaViewFragment) this).A0y;
            if (r0 == null) {
                return null;
            }
            return r0.A0v;
        } else if (!(this instanceof LinkedAccountMediaViewFragment)) {
            return ((CatalogMediaViewFragment) this).A0F;
        } else {
            LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = (LinkedAccountMediaViewFragment) this;
            return ((AnonymousClass77G) linkedAccountMediaViewFragment.A0H.get(linkedAccountMediaViewFragment.A03)).A01.A04;
        }
    }

    public Object A2A() {
        if (this instanceof MediaViewFragment) {
            return ((MediaViewFragment) this).A0x;
        }
        if (this instanceof LinkedAccountMediaViewFragment) {
            LinkedAccountMediaViewFragment linkedAccountMediaViewFragment = (LinkedAccountMediaViewFragment) this;
            return ((AnonymousClass77G) linkedAccountMediaViewFragment.A0H.get(linkedAccountMediaViewFragment.A03)).A01.A04;
        }
        CatalogMediaViewFragment catalogMediaViewFragment = (CatalogMediaViewFragment) this;
        C20287AEv aEv = catalogMediaViewFragment.A04;
        if (aEv == null) {
            C18070vi.A11("product");
            throw null;
        }
        String A002 = A1M.A00(aEv.A0H, catalogMediaViewFragment.A00);
        C18070vi.A0X(A002);
        return A002;
    }

    public Object A2B(int i) {
        if (this instanceof MediaViewFragment) {
            AnonymousClass21V A042 = MediaViewFragment.A04((MediaViewFragment) this, i);
            if (A042 != null) {
                return A042.A0v;
            }
            return null;
        } else if (this instanceof LinkedAccountMediaViewFragment) {
            return ((AnonymousClass77G) ((LinkedAccountMediaViewFragment) this).A0H.get(i)).A01.A04;
        } else {
            C20287AEv aEv = ((CatalogMediaViewFragment) this).A04;
            if (aEv == null) {
                C18070vi.A11("product");
                throw null;
            }
            String A002 = A1M.A00(aEv.A0H, i);
            C18070vi.A0X(A002);
            return A002;
        }
    }

    public void A2E() {
        if (this instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            Log.i("MediaViewFragment/onBackPressed");
            AnonymousClass7RT r1 = mediaViewFragment.A0B;
            if (r1 != null) {
                r1.A00 = true;
                ((Thread) r1.A04).interrupt();
                mediaViewFragment.A0B = null;
            }
            C160898Aj r0 = mediaViewFragment.A0m;
            if (r0 != null) {
                r0.COX();
            }
            MediaViewFragment.A0C(mediaViewFragment);
            mediaViewFragment.A2C();
            return;
        }
        A2C();
    }

    public void A2F() {
        if (this instanceof MediaViewFragment) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this;
            if (mediaViewFragment.A0g == null || (mediaViewFragment.A1g && mediaViewFragment.A0y != null)) {
                Log.i("MediaViewFragment/onelAllMedia if branch");
                mediaViewFragment.A2E();
                return;
            }
            Log.i("MediaViewFragment/onelAllMedia else branch");
            mediaViewFragment.A0y = null;
            mediaViewFragment.A1k(AnonymousClass1LU.A0Y(C108955ca.A0A(mediaViewFragment, mediaViewFragment.A1b), mediaViewFragment.A0g));
            mediaViewFragment.A2D();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.A7D, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0077, code lost:
        if (r3 != null) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2G(int r7) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof com.whatsapp.mediaview.MediaViewFragment
            if (r0 == 0) goto L_0x0172
            r4 = r6
            com.whatsapp.mediaview.MediaViewFragment r4 = (com.whatsapp.mediaview.MediaViewFragment) r4
            X.21V r3 = com.whatsapp.mediaview.MediaViewFragment.A04(r4, r7)
            X.1KB r0 = r4.A0F
            java.lang.Runnable r5 = r4.A1w
            r0.A0I(r5)
            X.70X r0 = r4.A1E
            if (r0 == 0) goto L_0x0077
            X.21V r0 = r4.A10
            if (r0 == 0) goto L_0x0077
            if (r3 == 0) goto L_0x0022
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0079
        L_0x0022:
            X.70X r0 = r4.A1E
            r0.A0B()
            java.util.HashMap r2 = r4.A1x
            X.21V r0 = r4.A10
            X.205 r1 = r0.A0v
            X.70X r0 = r4.A1E
            int r0 = r0.A05()
            X.C17890vO.A0z(r1, r2, r0)
            X.21V r0 = r4.A10
            X.205 r1 = r0.A0v
            X.70X r0 = r4.A1E
            android.graphics.Bitmap r2 = r0.A08()
            if (r2 == 0) goto L_0x0059
            java.lang.String r1 = r1.A01
            X.205 r0 = r4.A0x
            java.lang.String r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0059
            X.1c4 r0 = r4.A0s
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0059
            com.whatsapp.mediaview.MediaViewFragment.A08(r2, r4)
        L_0x0059:
            X.70X r0 = r4.A1E
            r0.A0F()
            X.70X r0 = r4.A1E
            r0.A0C()
            X.70X r2 = r4.A1E
            r1 = 4
            boolean r0 = r2 instanceof X.C122076Mr
            if (r0 == 0) goto L_0x006c
            r2.A01 = r1
        L_0x006c:
            X.1hB r2 = r4.A0l
            X.21V r1 = r4.A10
            r0 = 0
            X.C32431hB.A06(r2, r1, r0, r0, r0)
            r0 = 0
            r4.A1E = r0
        L_0x0077:
            if (r3 == 0) goto L_0x00f3
        L_0x0079:
            int r1 = r3.A0u
            r0 = 2
            if (r1 != r0) goto L_0x00f3
            X.21V r0 = r4.A10
            if (r0 == 0) goto L_0x008c
            X.205 r1 = r0.A0v
            X.205 r0 = r3.A0v
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x008f
        L_0x008c:
            com.whatsapp.mediaview.MediaViewFragment.A0M(r4, r3)
        L_0x008f:
            int r0 = r4.A04
            if (r0 == r7) goto L_0x00af
            X.21V r0 = r4.A10
            if (r0 == 0) goto L_0x00af
            if (r3 == 0) goto L_0x00af
            X.205 r0 = r3.A0v
            com.whatsapp.mediaview.PhotoView r2 = r4.A28(r0)
            if (r2 == 0) goto L_0x00af
            android.graphics.Matrix r1 = r2.A0A
            android.graphics.Matrix r0 = r2.A0B
            r1.set(r0)
            float r0 = r2.A06
            r2.A00 = r0
            r2.setImageMatrix(r1)
        L_0x00af:
            X.21V r0 = r4.A10
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x00bc
            r0 = 1
            r4.A1i = r0
        L_0x00bc:
            X.21V r0 = r4.A10
            if (r0 == r3) goto L_0x00c8
            com.whatsapp.reactions.ReactionsTrayViewModel r1 = r4.A13
            if (r1 == 0) goto L_0x00c8
            r0 = 0
            r1.A0T(r0)
        L_0x00c8:
            com.whatsapp.mediaview.MediaViewFragment.A0E(r4)
            r4.A10 = r3
            com.whatsapp.mediaview.MediaViewCurrentMessageViewModel r0 = r4.A0n
            if (r0 == 0) goto L_0x00d4
            r0.A0V(r3)
        L_0x00d4:
            r4.A04 = r7
            com.whatsapp.mediaview.MediaViewFragment.A0I(r4, r7)
            X.1FL r0 = r4.A1D()
            android.view.View r0 = X.AnonymousClass3MZ.A0F(r0)
            int r0 = r0.getSystemUiVisibility()
            r1 = r0 & -3
            X.1FL r0 = r4.A1D()
            android.view.View r0 = X.AnonymousClass3MZ.A0F(r0)
            r0.setSystemUiVisibility(r1)
            return
        L_0x00f3:
            boolean r0 = r4.A1f
            if (r0 == 0) goto L_0x014e
            if (r3 == 0) goto L_0x016d
            int r1 = r3.A0u
            boolean r0 = X.AnonymousClass72Z.A00(r1)
            if (r0 == 0) goto L_0x012f
            java.util.Map r0 = r4.A1z
            X.205 r2 = r3.A0v
            java.lang.Object r1 = r0.get(r2)
            X.70X r1 = (X.AnonymousClass70X) r1
            r4.A1E = r1
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x008f
            if (r1 == 0) goto L_0x008f
            boolean r0 = r1.A0e()
            if (r0 != 0) goto L_0x008f
            r1.A0G()
            java.util.HashMap r0 = r4.A1x
            java.lang.Number r0 = X.C108945cZ.A1D(r2, r0)
            if (r0 == 0) goto L_0x008f
            X.70X r1 = r4.A1E
            int r0 = r0.intValue()
            r1.A0M(r0)
            goto L_0x008f
        L_0x012f:
            boolean r0 = X.C108985cd.A1U(r1)
            if (r0 == 0) goto L_0x016d
            java.util.Map r1 = r4.A1z
            X.205 r0 = r3.A0v
            java.lang.Object r0 = r1.get(r0)
            X.70X r0 = (X.AnonymousClass70X) r0
            r4.A1E = r0
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x008f
            X.1KB r2 = r4.A0F
            r0 = 150(0x96, double:7.4E-322)
            r2.A0K(r5, r0)
            goto L_0x008f
        L_0x014e:
            if (r3 == 0) goto L_0x016d
            int r0 = r3.A0u
            boolean r0 = X.C108985cd.A1U(r0)
            if (r0 == 0) goto L_0x016d
            boolean r0 = r4.A0F
            if (r0 != 0) goto L_0x008f
            java.util.Map r1 = r4.A1y
            X.205 r0 = r3.A0v
            java.lang.Object r0 = r1.get(r0)
            X.70X r0 = (X.AnonymousClass70X) r0
            if (r0 == 0) goto L_0x008f
            r0.A0E()
            goto L_0x008f
        L_0x016d:
            com.whatsapp.mediaview.MediaViewFragment.A0G(r4)
            goto L_0x008f
        L_0x0172:
            boolean r0 = r6 instanceof com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment
            if (r0 == 0) goto L_0x0189
            r2 = r6
            com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment r2 = (com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment) r2
            r2.A01 = r7
            java.util.List r0 = r2.A0H
            java.lang.Object r0 = r0.get(r7)
            X.77G r0 = (X.AnonymousClass77G) r0
            long r0 = r0.A00
            com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment.A02(r2, r0)
            return
        L_0x0189:
            r3 = r6
            com.whatsapp.biz.catalog.CatalogMediaViewFragment r3 = (com.whatsapp.biz.catalog.CatalogMediaViewFragment) r3
            X.6Mr r0 = r3.A0D
            if (r0 == 0) goto L_0x0193
            r0.A0B()
        L_0x0193:
            X.6Mr r0 = r3.A0D
            if (r0 == 0) goto L_0x019a
            r0.A0F()
        L_0x019a:
            r2 = 0
            r3.A0D = r2
            X.AEv r0 = r3.A04
            java.lang.String r5 = "product"
            if (r0 != 0) goto L_0x01a7
            X.C18070vi.A11(r5)
            throw r2
        L_0x01a7:
            int r0 = X.C108945cZ.A08(r0)
            if (r7 < r0) goto L_0x01f1
            X.AEv r0 = r3.A04
            if (r0 != 0) goto L_0x01b5
            X.C18070vi.A11(r5)
            throw r2
        L_0x01b5:
            int r1 = X.C108945cZ.A08(r0)
            X.AEv r0 = r3.A04
            if (r0 != 0) goto L_0x01c1
            X.C18070vi.A11(r5)
            throw r2
        L_0x01c1:
            java.util.List r0 = r0.A0B
            int r0 = X.C108945cZ.A0A(r0, r1)
            if (r7 >= r0) goto L_0x01f1
            r4 = 1
            X.AEv r0 = r3.A04
            if (r0 != 0) goto L_0x01d2
            X.C18070vi.A11(r5)
            throw r2
        L_0x01d2:
            int r0 = X.C108945cZ.A08(r0)
            int r7 = r7 - r0
            X.AEv r0 = r3.A04
            if (r0 != 0) goto L_0x01df
            X.C18070vi.A11(r5)
            throw r2
        L_0x01df:
            java.util.List r0 = r0.A0B
            java.lang.Object r0 = r0.get(r7)
            X.773 r0 = (X.AnonymousClass773) r0
            java.util.HashMap r1 = r3.A0G
            if (r1 != 0) goto L_0x01f3
            java.lang.String r0 = "videoPlayers"
            X.C18070vi.A11(r0)
            throw r2
        L_0x01f1:
            r4 = 0
            goto L_0x020a
        L_0x01f3:
            java.lang.String r0 = r0.A02
            java.lang.Object r1 = r1.get(r0)
            X.6Mr r1 = (X.C122076Mr) r1
            r3.A0D = r1
            if (r1 == 0) goto L_0x020a
            boolean r0 = r1.A0I
            if (r0 != 0) goto L_0x020a
            boolean r0 = r3.A0F
            if (r0 != 0) goto L_0x020a
            r1.A0G()
        L_0x020a:
            X.A7D r1 = new X.A7D
            r1.<init>()
            X.C109005cf.A0k(r3, r1)
            X.AEv r0 = r3.A04
            if (r0 != 0) goto L_0x021a
            X.C18070vi.A11(r5)
            throw r2
        L_0x021a:
            java.lang.String r0 = r0.A0H
            r1.A0H = r0
            com.whatsapp.jid.UserJid r0 = r3.A0B
            r1.A00 = r0
            if (r4 == 0) goto L_0x023c
            r0 = 52
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A06 = r0
            r0 = 91
        L_0x022e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A04 = r0
            X.A8Q r0 = r3.A05
            if (r0 == 0) goto L_0x0245
            r0.A09(r1)
            return
        L_0x023c:
            java.lang.Integer r0 = X.C108955ca.A0g()
            r1.A06 = r0
            r0 = 30
            goto L_0x022e
        L_0x0245:
            java.lang.String r0 = "catalogAnalyticManager"
            X.C18070vi.A11(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewBaseFragment.A2G(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r2 = (com.whatsapp.mediaview.MediaViewFragment) r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2H(int r4, boolean r5) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof com.whatsapp.mediaview.MediaViewFragment
            if (r0 == 0) goto L_0x0047
            r2 = r3
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            X.1FL r0 = r2.A1B()
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L_0x0047
            X.8Aj r0 = r2.A0m
            if (r0 == 0) goto L_0x001a
            r0.getCount()
        L_0x001a:
            r2.A04 = r4
            X.1FL r0 = r2.A1B()
            if (r0 == 0) goto L_0x0029
            X.5rJ r0 = r2.A08
            if (r0 == 0) goto L_0x0029
            r0.A04()
        L_0x0029:
            X.65h r1 = r2.A09
            r0 = 0
            r1.A0J(r4, r0)
            if (r5 == 0) goto L_0x0036
            if (r4 != 0) goto L_0x0036
            r2.A2G(r4)
        L_0x0036:
            com.whatsapp.mediaview.MediaViewFragment.A0J(r2, r4, r5)
            X.1FL r0 = r2.A1D()
            r0.invalidateOptionsMenu()
            android.view.View r1 = r2.A01
            r0 = 8
            r1.setVisibility(r0)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediaview.MediaViewBaseFragment.A2H(int, boolean):void");
    }

    public void A2I(AnonymousClass8AR r3) {
        C114595rJ r1 = new C114595rJ(r3, this);
        this.A08 = r1;
        this.A09.setAdapter(r1);
        this.A09.A0J(0, false);
    }

    public void A2K(boolean z, int i) {
        AlphaAnimation alphaAnimation;
        int childCount = this.A09.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View findViewById = this.A09.getChildAt(i2).findViewById(2131430949);
            if (findViewById != null) {
                int visibility = findViewById.getVisibility();
                if (z) {
                    if (visibility != 0) {
                        alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                        findViewById.setVisibility(0);
                    }
                } else if (visibility != 4) {
                    alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    findViewById.setVisibility(4);
                }
                if (i > 0) {
                    alphaAnimation.setDuration((long) i);
                    findViewById.startAnimation(alphaAnimation);
                }
            }
        }
    }

    public void A2L(boolean z, boolean z2) {
        AlphaAnimation alphaAnimation;
        AnonymousClass1FL A1B;
        if (!this.A0F && this.A0I != z) {
            this.A0I = z;
            A2K(z, 400);
            int A062 = C72453Mb.A06(this.A0I ? 1 : 0);
            if (!z) {
                alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            }
            alphaAnimation.setDuration(250);
            View view = this.A02;
            if (!(view == null || view.getVisibility() == A062)) {
                this.A02.setVisibility(A062);
                this.A02.startAnimation(alphaAnimation);
            }
            ViewGroup viewGroup = this.A03;
            if (!(viewGroup == null || viewGroup.getVisibility() == A062)) {
                this.A03.setVisibility(A062);
                this.A03.startAnimation(alphaAnimation);
            }
            InsetsDrawingView insetsDrawingView = this.A07;
            if (!(insetsDrawingView == null || insetsDrawingView.getVisibility() == A062)) {
                this.A07.setVisibility(A062);
                this.A07.startAnimation(alphaAnimation);
            }
            if (z2 && (A1B = A1B()) != null) {
                boolean z3 = this.A0I;
                int i = VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH;
                if (!z3) {
                    i = 1285;
                }
                int i2 = i | EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH | 512;
                if (!z3) {
                    i2 |= 2;
                }
                AnonymousClass3MZ.A0F(A1B).setSystemUiVisibility(i2);
            }
        }
    }

    public void C9F(boolean z) {
        Runnable runnable = this.A0E;
        if (runnable != null && z) {
            runnable.run();
        }
        this.A0F = false;
        C1600787a r0 = this.A0A;
        if (r0 != null) {
            r0.C9F(z);
            this.A0A = null;
        }
        if (this.A0G && this.A0J) {
            A2L(true, true);
        }
    }

    public static void A01(View view, MediaViewBaseFragment mediaViewBaseFragment) {
        C132146mH r6;
        View findViewById = view.findViewById(2131430949);
        if (findViewById != null && (r6 = mediaViewBaseFragment.A0D) != null) {
            C33321id r4 = r6.A01;
            C33321id A002 = C33321id.A00(r4.A01, 0, r4.A02, 0);
            C33321id A003 = r6.A00();
            C33321id A004 = C33321id.A00(A003.A01, 0, A003.A02, 0);
            C33321id A005 = C33321id.A00(0, 0, 0, C33321id.A02(r6.A00, r4).A00);
            ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(findViewById);
            A0P.leftMargin = A002.A01;
            A0P.topMargin = A002.A03;
            A0P.rightMargin = A002.A02;
            A0P.bottomMargin = A002.A00;
            findViewById.setLayoutParams(A0P);
            C33321id A006 = C33321id.A00(A004.A01 + A005.A01, A004.A03 + A005.A03, A004.A02 + A005.A02, A004.A00 + A005.A00);
            findViewById.setPadding(A006.A01, A006.A03, A006.A02, A006.A00);
        }
    }

    public void A1j() {
        super.A1j();
        A2L(true, true);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        try {
            return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625978);
        } catch (OutOfMemoryError e) {
            this.A0K = e;
            return null;
        }
    }

    public void A1u() {
        C219217x r0;
        super.A1u();
        if (!this.A0H) {
            Context A14 = A14();
            if (this instanceof MediaViewFragment) {
                r0 = ((MediaViewFragment) this).A0U;
            } else if (this instanceof LinkedAccountMediaViewFragment) {
                r0 = ((LinkedAccountMediaViewFragment) this).A0A;
            } else {
                r0 = ((CatalogMediaViewFragment) this).A09;
                if (r0 == null) {
                    C18070vi.A11("permissionsHelper");
                    throw null;
                }
            }
            if (!AnonymousClass74O.A0O(A14, r0)) {
                this.A0H = true;
                A2D();
            }
        }
        A2L(true, true);
    }

    public void A1x(Context context) {
        super.A1x(context);
        if ((this instanceof MediaViewFragment) || (this instanceof LinkedAccountMediaViewFragment) || ((CatalogMediaViewFragment) this).A01 != null) {
            AnonymousClass1L9.A04(C108965cb.A0B(this));
        } else {
            C18070vi.A11("androidActivityUtils");
            throw null;
        }
    }

    public void A1z(Bundle bundle) {
        AnonymousClass745 r0;
        C219217x r02;
        C18030ve A26 = A26();
        boolean z = this instanceof MediaViewFragment;
        AnonymousClass4ZR r1 = new AnonymousClass4ZR(A1D());
        if (C1402270m.A01(A26)) {
            r0 = null;
        } else if (AnonymousClass745.A00) {
            r0 = new AnonymousClass6A9(r1, this);
        } else {
            r0 = new AnonymousClass6A8(this);
        }
        this.A0B = r0;
        super.A1z(bundle);
        if (!this.A0H) {
            Context A14 = A14();
            if (z) {
                r02 = ((MediaViewFragment) this).A0U;
            } else if (this instanceof LinkedAccountMediaViewFragment) {
                r02 = ((LinkedAccountMediaViewFragment) this).A0A;
            } else {
                r02 = ((CatalogMediaViewFragment) this).A09;
                if (r02 == null) {
                    C18070vi.A11("permissionsHelper");
                    throw null;
                }
            }
            if (!AnonymousClass74O.A0O(A14, r02)) {
                this.A0H = true;
                A2D();
            }
        }
        this.A09 = new AnonymousClass65h(A14(), this);
        Bundle bundle2 = this.A06;
        if (bundle2 == null) {
            A2D();
        } else {
            this.A00 = bundle2.getBundle("animation_bundle");
        }
    }

    public void A21(Bundle bundle, View view) {
        ViewGroup A0C2 = AnonymousClass3MW.A0C(A17(), 2131436272);
        this.A03 = A0C2;
        A0C2.setFitsSystemWindows(false);
        Toolbar toolbar = (Toolbar) AnonymousClass1HF.A06(this.A03, 2131436270);
        toolbar.A0L();
        ((AnonymousClass01E) A1D()).setSupportActionBar(toolbar);
        C003401n A0J2 = AnonymousClass3MY.A0J((AnonymousClass01E) A1D());
        A0J2.A0Y(false);
        A0J2.A0W(true);
        toolbar.setNavigationOnClickListener(new AnonymousClass78K(this, 46));
        View inflate = LayoutInflater.from(((AnonymousClass01E) A1D()).getSupportActionBar().A0A()).inflate(2131625979, (ViewGroup) null, false);
        View A062 = AnonymousClass1HF.A06(inflate, 2131436230);
        A062.setClickable(true);
        AnonymousClass78K.A00(A062, this, 47);
        this.A06 = AnonymousClass3MX.A0V(A062, 2131429428);
        this.A05 = AnonymousClass3MW.A0J(A062, 2131429798);
        A26();
        if (C22891Dp.A09) {
            C29261bv.A08(this.A06, 2132084449);
            C29261bv.A08(this.A05, 2132084445);
            int A002 = C19740yt.A00(A14(), AnonymousClass2QJ.A00.A00);
            this.A06.setTextColor(A002);
            this.A05.setTextColor(A002);
        }
        this.A01 = AnonymousClass1HF.A06(inflate, 2131434181);
        A0J2.A0G();
        A0J2.A0P(inflate);
        this.A07 = (InsetsDrawingView) AnonymousClass1HF.A06(view, 2131431658);
        this.A02 = AnonymousClass1HF.A06(view, 2131436235);
        this.A04 = AnonymousClass3MW.A0C(view, 2131433402);
        this.A0C = C28931bI.A00(view, 2131432448);
        this.A04.addView(this.A09);
        AnonymousClass3MZ.A0F(A1D()).setSystemUiVisibility(1792);
        View view2 = C108945cZ.A0Y(this).A00;
        C17960vV.A05(view2);
        AnonymousClass1HF.A0g(view2, new C1425779z(this, 1));
        View findViewById = view.findViewById(2131428018);
        findViewById.setBackground(new ColorDrawable(-16777216));
        C1188565n r1 = new C1188565n(A14(), this);
        r1.A00 = 0.5f;
        r1.A06 = true;
        r1.A04 = new C144467Hk(findViewById, this);
        ((C37891qK) this.A04.getLayoutParams()).A00(r1);
        onConfigurationChanged(AnonymousClass3MZ.A09(this).getConfiguration());
        this.A0J = true;
    }

    public void A2C() {
        Bundle bundle;
        C23301Fm r0 = (C23301Fm) A1B();
        if (r0 != null) {
            r0.Brw();
        }
        AnonymousClass745 r2 = this.A0B;
        if (r2 == null || (bundle = this.A00) == null) {
            A2D();
            return;
        }
        this.A0F = true;
        r2.A0C(bundle);
    }

    public void A2D() {
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && !A1B.isFinishing()) {
            if (A1D() instanceof C23301Fm) {
                ((C23301Fm) A1D()).ByA();
                return;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("mediaview/finish called from non-host activity: ");
            C17890vO.A19(A10, A1D().getLocalClassName());
            C108955ca.A1M(this);
        }
    }

    public boolean A2M() {
        AnonymousClass1FL A1B = A1B();
        if (!(A1B instanceof C23301Fm) || !((C23301Fm) A1B).CMW()) {
            return false;
        }
        return true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Window A0B2 = C108965cb.A0B(this);
        A0B2.setStatusBarColor(0);
        A0B2.setNavigationBarColor(0);
        if (AnonymousClass112.A06()) {
            A0B2.setStatusBarContrastEnforced(false);
            A0B2.setNavigationBarContrastEnforced(false);
        }
        A0B2.addFlags(Integer.MIN_VALUE);
    }
}
