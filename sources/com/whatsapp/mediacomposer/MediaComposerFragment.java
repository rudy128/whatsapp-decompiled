package com.whatsapp.mediacomposer;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass02n;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass18O;
import X.AnonymousClass190;
import X.AnonymousClass1A3;
import X.AnonymousClass1FL;
import X.AnonymousClass1GP;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L4;
import X.AnonymousClass1SB;
import X.AnonymousClass1T1;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4Ql;
import X.AnonymousClass4aO;
import X.AnonymousClass689;
import X.AnonymousClass69K;
import X.AnonymousClass69Y;
import X.AnonymousClass6GH;
import X.AnonymousClass6GI;
import X.AnonymousClass6GJ;
import X.AnonymousClass6a6;
import X.AnonymousClass70X;
import X.AnonymousClass72m;
import X.AnonymousClass77N;
import X.AnonymousClass7IT;
import X.AnonymousClass7JF;
import X.AnonymousClass7JN;
import X.AnonymousClass7JS;
import X.AnonymousClass7RA;
import X.AnonymousClass87S;
import X.C108945cZ;
import X.C108955ca;
import X.C108975cc;
import X.C109005cf;
import X.C109225d1;
import X.C109235d2;
import X.C1192967n;
import X.C1193367s;
import X.C126436cj;
import X.C127826ez;
import X.C134126q5;
import X.C135806sn;
import X.C136246tV;
import X.C136926ud;
import X.C136986uj;
import X.C138786xg;
import X.C1406772n;
import X.C1409773u;
import X.C1410073x;
import X.C1422878w;
import X.C1423479c;
import X.C151567mV;
import X.C151817mu;
import X.C151827mv;
import X.C151837mw;
import X.C151847mx;
import X.C151937n6;
import X.C156207tz;
import X.C156217u0;
import X.C160888Ai;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C18150vq;
import X.C19830z4;
import X.C219217x;
import X.C24641Lc;
import X.C26521Sl;
import X.C26631Sw;
import X.C27091Ur;
import X.C34441kU;
import X.C36331ni;
import X.C43531zx;
import X.C72453Mb;
import X.C99274sY;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.whatsapp.jobqueue.job.exception.OutOfMemoryException;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import com.whatsapp.mediacomposer.ui.caption.CaptionFragment;
import com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel;
import com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.List;

public abstract class MediaComposerFragment extends Hilt_MediaComposerFragment implements AnonymousClass87S {
    public int A00;
    public Uri A01;
    public ViewTreeObserver.OnGlobalLayoutListener A02;
    public ImageView A03;
    public AnonymousClass190 A04;
    public AnonymousClass6a6 A05;
    public AnonymousClass1T1 A06;
    public AnonymousClass1KB A07;
    public AnonymousClass18O A08;
    public AnonymousClass11C A09;
    public AnonymousClass11P A0A;
    public AnonymousClass118 A0B;
    public C219217x A0C;
    public C19830z4 A0D;
    public C18000vb A0E;
    public AnonymousClass1KW A0F;
    public C18030ve A0G;
    public AnonymousClass689 A0H;
    public AnonymousClass7JN A0I;
    public AnonymousClass7JF A0J;
    public C1422878w A0K;
    public C1193367s A0L;
    public AnonymousClass7IT A0M;
    public C1192967n A0N;
    public C34441kU A0O;
    public C136246tV A0P;
    public C26631Sw A0Q;
    public AnonymousClass1SB A0R;
    public C36331ni A0S;
    public AnonymousClass1L4 A0T;
    public C26521Sl A0U;
    public AnonymousClass10I A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public AnonymousClass00H A0Z;
    public AnonymousClass00H A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass00H A0c;
    public AnonymousClass00H A0d;
    public AnonymousClass00H A0e;
    public AnonymousClass00H A0f;
    public AnonymousClass00H A0g;
    public C18090vk A0h;
    public boolean A0i;
    public boolean A0j;
    public C136926ud A0k;
    public boolean A0l = true;
    public boolean A0m;
    public final AnonymousClass02n A0n = CDw(new C1423479c(this, 7), new Object());
    public final C18100vl A0o;
    public final C18100vl A0p;
    public final int[] A0q = C108945cZ.A1W();

    public void A1Q(Bundle bundle) {
        this.A0X = true;
        Log.i("MediaComposerFragment/onViewStateRestored");
        AnonymousClass7JF r3 = this.A0J;
        if (r3 != null) {
            r3.A0P.CKu(r3.A0M.A00, r3.A0L.getSelectedStrokeSize());
            r3.A06 = true;
        }
    }

    public void A1w(int i, int i2, Intent intent) {
        Bundle extras;
        C136986uj A0U2;
        if (i == 2) {
            C160888Ai A29 = A29();
            if (!(A29 == null || (A0U2 = C108955ca.A0U((MediaComposerActivity) A29)) == null)) {
                A0U2.A07(0);
            }
            if (i2 == -1 && intent != null && (extras = intent.getExtras()) != null) {
                String string = extras.getString("locations_string");
                if (string == null || string.length() == 0) {
                    string = A1H(2131894251);
                }
                double d = extras.getDouble("longitude");
                double d2 = extras.getDouble("latitude");
                Context A14 = A14();
                C18000vb r6 = this.A0E;
                if (r6 != null) {
                    C18070vi.A0d(string, 3);
                    AnonymousClass69Y r1 = new AnonymousClass69Y(A14, r6, string, false);
                    r1.A01 = d;
                    r1.A00 = d2;
                    AnonymousClass7JF r0 = this.A0J;
                    if (r0 != null) {
                        r0.A0D(r1);
                        return;
                    }
                    return;
                }
                AnonymousClass3MW.A1M();
                throw null;
            }
            return;
        }
        super.A1w(i, i2, intent);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: X.6UC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v0, resolved type: X.6UC} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01e4, code lost:
        if (r0 == null) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01e6, code lost:
        A2O(r0);
        r8 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01ea, code lost:
        r9.A03 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01f0, code lost:
        if (A2U() != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01f6, code lost:
        if (A2V() == false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01f8, code lost:
        r1 = r10.findViewById(2131428829);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ff, code lost:
        if (r1 == null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0201, code lost:
        A2O(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0208, code lost:
        if (A2U() != false) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x020e, code lost:
        if (A2V() != false) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0210, code lost:
        r1 = X.C108955ca.A0R(A2B());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0218, code lost:
        if (r7 != false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x021a, code lost:
        if (r5 == false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x021c, code lost:
        r0 = 8644;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0222, code lost:
        if (X.C18020vd.A05(r3, r1, r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0224, code lost:
        r3 = new X.C1422878w(r10, (android.view.ViewStub) X.AnonymousClass3MX.A0C(r10, 2131430766), X.C108945cZ.A1K(r9, 22));
        r2 = new X.C126066c8(r9);
        r1 = r3.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0243, code lost:
        if (r1.contains(r2) != false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0245, code lost:
        r1.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0248, code lost:
        r9.A0K = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x024b, code lost:
        r0 = 8807;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x024e, code lost:
        r1 = r1.getLayoutParams();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0254, code lost:
        if ((r1 instanceof X.C39151sZ) == false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0256, code lost:
        r1 = (X.C39151sZ) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0258, code lost:
        if (r1 == null) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x025a, code lost:
        r1.A0t = "9:16";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0262, code lost:
        if (A2U() == false) goto L_0x0210;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0264, code lost:
        r1.A08 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x026e, code lost:
        if (X.C18020vd.A05(r3, r1, 8644) == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0270, code lost:
        r62 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0274, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0277, code lost:
        if (r5 == false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0279, code lost:
        r4 = ((com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout) X.AnonymousClass3MX.A14(((com.whatsapp.mediacomposer.ImageComposerFragment) r9).A0G)).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0288, code lost:
        r4 = new X.AnonymousClass697();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02a2, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, X.C108955ca.A0R(A2B()), 11003) == false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02cf, code lost:
        X.C18070vi.A11("templateComposerControllerFactory");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02d4, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02d5, code lost:
        X.C18070vi.A11("doodleFactory");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02da, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02db, code lost:
        X.C18070vi.A11("time");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02e0, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02e1, code lost:
        X.C18070vi.A11("shapeStickerLayoutDataProvider");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x02e6, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02e7, code lost:
        X.C18070vi.A11("mediaSharingUserJourneyLogger");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02ec, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x02ed, code lost:
        X.C18070vi.A11("colorPickerStateManagerFactory");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02f2, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02f3, code lost:
        X.C18070vi.A11("expressionsTrayControllerLazy");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02f8, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02f9, code lost:
        X.C18070vi.A11("expressionsShapeCreatorLazy");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02fe, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ff, code lost:
        X.C18070vi.A11("stickerImageFileLoader");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0304, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0305, code lost:
        X.C18070vi.A11("shapeDictionaryStore");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x030a, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x030b, code lost:
        X.C18070vi.A11("waSharedPreferences");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0310, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0311, code lost:
        X.C18070vi.A11("shapeSearchProvider");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0316, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0317, code lost:
        X.C18070vi.A11("stickerRepository");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x031c, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x031d, code lost:
        X.C18070vi.A11("stickerObservers");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0322, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0323, code lost:
        X.AnonymousClass3MW.A1M();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0326, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0327, code lost:
        X.AnonymousClass3MW.A1N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x032a, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x032b, code lost:
        X.C18070vi.A11("recentShapes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0330, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0331, code lost:
        X.C18070vi.A11("emojiLoader");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0336, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0337, code lost:
        X.AnonymousClass3MW.A1G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x033a, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x033b, code lost:
        X.C18070vi.A11("imeUtils");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0340, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r4 == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        if (A2V() != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r4 != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0077, code lost:
        if (A2V() == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0079, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r4 != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        if (A2V() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        r0 = new X.C135796sm(r2, r1, r3, r4);
        r43 = A28();
        r0 = r9.A0T;
        r30 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0092, code lost:
        if (r0 == null) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0094, code lost:
        r0 = r9.A0V;
        r29 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0098, code lost:
        if (r0 == null) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009a, code lost:
        r0 = r9.A0F;
        r28 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        if (r0 == null) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a0, code lost:
        r0 = r9.A0L;
        r27 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a4, code lost:
        if (r0 == null) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a6, code lost:
        r0 = r9.A09;
        r26 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        if (r0 == null) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        r0 = r9.A0E;
        r25 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        if (r0 == null) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b2, code lost:
        r0 = r9.A0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        if (r0 == null) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        r14 = (X.AnonymousClass2LK) X.C18070vi.A0E(r0);
        r0 = r9.A0R;
        r24 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c0, code lost:
        if (r0 == null) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c2, code lost:
        r0 = r9.A0N;
        r23 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c6, code lost:
        if (r0 == null) goto L_0x0311;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c8, code lost:
        r0 = r9.A0D;
        r22 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cc, code lost:
        if (r0 == null) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ce, code lost:
        r0 = r9.A0M;
        r21 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d2, code lost:
        if (r0 == null) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d4, code lost:
        r0 = r9.A0Q;
        r20 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d8, code lost:
        if (r0 == null) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00da, code lost:
        r0 = r9.A0W;
        r19 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00de, code lost:
        if (r0 == null) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e0, code lost:
        r0 = r9.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e2, code lost:
        if (r0 == null) goto L_0x02f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e4, code lost:
        r13 = (X.AnonymousClass74J) X.C18070vi.A0E(r0);
        r32 = A1D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ee, code lost:
        if (r7 == false) goto L_0x0277;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f0, code lost:
        r1 = (com.whatsapp.mediacomposer.VideoComposerFragment) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00f5, code lost:
        if ((r1 instanceof com.whatsapp.mediacomposer.PtvComposerFragment) == false) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f7, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00f8, code lost:
        r4 = new X.AnonymousClass698(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fd, code lost:
        r0 = r9.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ff, code lost:
        if (r0 == null) goto L_0x02ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0101, code lost:
        r1 = r10.getContext();
        r2 = r0.A00.A02;
        r11 = X.C000500i.A00(r2.Ao9);
        r18 = new java.lang.Object();
        r3 = X.C18040vf.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0124, code lost:
        if (X.C18020vd.A05(r3, (X.C18020vd) r2.A04.get(), 12100) != false) goto L_0x0127;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0126, code lost:
        r1 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0127, code lost:
        r18.A00 = X.C19740yt.A00(r1, 2131100170);
        r0 = r9.A0Z;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0134, code lost:
        if (r0 == null) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0136, code lost:
        r12 = (X.C20050A4v) X.C18070vi.A0E(r0);
        r1 = X.C108955ca.A0R(A2B());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0144, code lost:
        if (r5 != false) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x014c, code lost:
        if (X.C18020vd.A05(r3, r1, 8807) != false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014e, code lost:
        r62 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0150, code lost:
        if (r5 == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0152, code lost:
        r63 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015e, code lost:
        if (X.C18020vd.A05(r3, A28(), 1493) != false) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0160, code lost:
        r63 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0162, code lost:
        r11 = (X.C24641Lc) X.C18070vi.A0E(A2B());
        r0 = r9.A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x016e, code lost:
        if (r0 == null) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0170, code lost:
        r2 = (X.AnonymousClass6g1) X.C18070vi.A0E(r0);
        r0 = r9.A0A;
        r17 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017a, code lost:
        if (r0 == null) goto L_0x02db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017c, code lost:
        r0 = r9.A06;
        r16 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0180, code lost:
        if (r0 == null) goto L_0x02d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0182, code lost:
        r15 = r9.A0e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0184, code lost:
        if (r15 == null) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0186, code lost:
        r1 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0188, code lost:
        if (r1 != null) goto L_0x018c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x018a, code lost:
        r1 = android.net.Uri.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x018c, code lost:
        X.C18070vi.A0b(r1);
        r28 = new X.AnonymousClass7JF(r1, r4, r10, r32, r9, r9, r16, r26, r17, r22, r25, r28, r2, r13, r43, r6, r9, r18, r0, r27, r21, r9, r23, r52, r11, r20, r14, r24, r30, r12, r29, r19, r15, r62, r63);
        r9.A0J = r28;
        r9.A0k = r6;
        r0 = r28.A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01d8, code lost:
        if (r0 == null) goto L_0x01dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01da, code lost:
        A2O(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01dd, code lost:
        r0 = X.AnonymousClass3MW.A0H(r10, 2131432365);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A21(android.os.Bundle r65, android.view.View r66) {
        /*
            r64 = this;
            r0 = 0
            r10 = r66
            X.C18070vi.A0d(r10, r0)
            java.lang.String r0 = "MediaComposerFragment/onViewCreated"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9 = r64
            android.os.Bundle r1 = r9.A06
            r8 = 0
            if (r1 == 0) goto L_0x02cc
            java.lang.String r0 = "uri"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
        L_0x001a:
            r9.A01 = r0
            android.os.Bundle r1 = r9.A06
            r3 = 0
            if (r1 == 0) goto L_0x02c9
            java.lang.String r0 = "is_ptv"
            boolean r0 = r1.getBoolean(r0)
        L_0x0027:
            r9.A0i = r0
            android.os.Bundle r1 = r9.A06
            if (r1 == 0) goto L_0x02c6
            java.lang.String r0 = "captured_with_old_camera_controller"
            boolean r0 = r1.getBoolean(r0)
        L_0x0033:
            r9.A0l = r0
            X.8Ai r0 = r9.A29()
            if (r0 == 0) goto L_0x003e
            r0.BUd()
        L_0x003e:
            X.8Ai r0 = r9.A29()
            if (r0 == 0) goto L_0x024a
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.6uj r52 = X.C108955ca.A0U(r0)
            if (r52 == 0) goto L_0x024a
            boolean r7 = r9 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r7 == 0) goto L_0x02ae
            r1 = r9
            com.whatsapp.mediacomposer.VideoComposerFragment r1 = (com.whatsapp.mediacomposer.VideoComposerFragment) r1
            boolean r0 = r1 instanceof com.whatsapp.mediacomposer.PtvComposerFragment
            if (r0 == 0) goto L_0x02a7
            com.whatsapp.mediacomposer.PtvComposerFragment r1 = (com.whatsapp.mediacomposer.PtvComposerFragment) r1
            X.696 r6 = new X.696
            r6.<init>((com.whatsapp.mediacomposer.PtvComposerFragment) r1)
        L_0x005e:
            boolean r5 = r9 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            boolean r4 = r9.A2U()
            if (r5 == 0) goto L_0x028f
            if (r4 != 0) goto L_0x006f
        L_0x0068:
            boolean r0 = r9.A2V()
            r2 = 0
            if (r0 == 0) goto L_0x0072
        L_0x006f:
            r2 = 1
            if (r4 != 0) goto L_0x0079
        L_0x0072:
            boolean r0 = r9.A2V()
            r1 = 0
            if (r0 == 0) goto L_0x007c
        L_0x0079:
            r1 = 1
            if (r4 != 0) goto L_0x0082
        L_0x007c:
            boolean r0 = r9.A2V()
            if (r0 == 0) goto L_0x0083
        L_0x0082:
            r3 = 1
        L_0x0083:
            X.6sm r31 = new X.6sm
            r0 = r31
            r0.<init>(r2, r1, r3, r4)
            X.0ve r43 = r9.A28()
            X.1L4 r0 = r9.A0T
            r30 = r0
            if (r0 == 0) goto L_0x033b
            X.10I r0 = r9.A0V
            r29 = r0
            if (r0 == 0) goto L_0x0337
            X.1KW r0 = r9.A0F
            r28 = r0
            if (r0 == 0) goto L_0x0331
            X.67s r0 = r9.A0L
            r27 = r0
            if (r0 == 0) goto L_0x032b
            X.11C r0 = r9.A09
            r26 = r0
            if (r0 == 0) goto L_0x0327
            X.0vb r0 = r9.A0E
            r25 = r0
            if (r0 == 0) goto L_0x0323
            X.00H r0 = r9.A0d
            if (r0 == 0) goto L_0x031d
            java.lang.Object r14 = X.C18070vi.A0E(r0)
            X.2LK r14 = (X.AnonymousClass2LK) r14
            X.1SB r0 = r9.A0R
            r24 = r0
            if (r0 == 0) goto L_0x0317
            X.67n r0 = r9.A0N
            r23 = r0
            if (r0 == 0) goto L_0x0311
            X.0z4 r0 = r9.A0D
            r22 = r0
            if (r0 == 0) goto L_0x030b
            X.7IT r0 = r9.A0M
            r21 = r0
            if (r0 == 0) goto L_0x0305
            X.1Sw r0 = r9.A0Q
            r20 = r0
            if (r0 == 0) goto L_0x02ff
            X.00H r0 = r9.A0W
            r19 = r0
            if (r0 == 0) goto L_0x02f9
            X.00H r0 = r9.A0X
            if (r0 == 0) goto L_0x02f3
            java.lang.Object r13 = X.C18070vi.A0E(r0)
            X.74J r13 = (X.AnonymousClass74J) r13
            X.1FL r32 = r9.A1D()
            if (r7 == 0) goto L_0x0277
            r1 = r9
            com.whatsapp.mediacomposer.VideoComposerFragment r1 = (com.whatsapp.mediacomposer.VideoComposerFragment) r1
            boolean r0 = r1 instanceof com.whatsapp.mediacomposer.PtvComposerFragment
            if (r0 == 0) goto L_0x0274
            r0 = 0
        L_0x00f8:
            X.698 r4 = new X.698
            r4.<init>(r1, r0)
        L_0x00fd:
            X.6a6 r0 = r9.A05
            if (r0 == 0) goto L_0x02ed
            android.content.Context r1 = r10.getContext()
            X.1na r0 = r0.A00
            X.10E r2 = r0.A02
            X.00V r0 = r2.Ao9
            android.content.Context r11 = X.C000500i.A00(r0)
            X.00S r0 = r2.A04
            java.lang.Object r2 = r0.get()
            X.0vd r2 = (X.C18020vd) r2
            X.6UC r18 = new X.6UC
            r18.<init>()
            r0 = 12100(0x2f44, float:1.6956E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r2, r0)
            if (r0 != 0) goto L_0x0127
            r1 = r11
        L_0x0127:
            r0 = 2131100170(0x7f06020a, float:1.7812714E38)
            int r1 = X.C19740yt.A00(r1, r0)
            r0 = r18
            r0.A00 = r1
            X.00H r0 = r9.A0Z
            if (r0 == 0) goto L_0x02e7
            java.lang.Object r12 = X.C18070vi.A0E(r0)
            X.A4v r12 = (X.C20050A4v) r12
            X.00H r0 = r9.A2B()
            X.0ve r1 = X.C108955ca.A0R(r0)
            if (r5 != 0) goto L_0x0268
            r0 = 8807(0x2267, float:1.2341E-41)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 != 0) goto L_0x0270
        L_0x014e:
            r62 = 0
        L_0x0150:
            if (r5 == 0) goto L_0x0160
            X.0ve r1 = r9.A28()
            r0 = 1493(0x5d5, float:2.092E-42)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            r63 = 1
            if (r0 != 0) goto L_0x0162
        L_0x0160:
            r63 = 0
        L_0x0162:
            X.00H r0 = r9.A2B()
            java.lang.Object r11 = X.C18070vi.A0E(r0)
            X.1Lc r11 = (X.C24641Lc) r11
            X.00H r0 = r9.A0b
            if (r0 == 0) goto L_0x02e1
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.6g1 r2 = (X.AnonymousClass6g1) r2
            X.11P r0 = r9.A0A
            r17 = r0
            if (r0 == 0) goto L_0x02db
            X.1T1 r0 = r9.A06
            r16 = r0
            if (r0 == 0) goto L_0x02d5
            X.00H r15 = r9.A0e
            if (r15 == 0) goto L_0x02cf
            android.net.Uri r1 = r9.A01
            if (r1 != 0) goto L_0x018c
            android.net.Uri r1 = android.net.Uri.EMPTY
        L_0x018c:
            X.C18070vi.A0b(r1)
            X.7JF r0 = new X.7JF
            r45 = r9
            r50 = r9
            r33 = r9
            r38 = r22
            r39 = r25
            r40 = r28
            r41 = r2
            r42 = r13
            r44 = r6
            r46 = r18
            r47 = r31
            r48 = r27
            r49 = r21
            r51 = r23
            r53 = r11
            r54 = r20
            r55 = r14
            r56 = r24
            r57 = r30
            r58 = r12
            r59 = r29
            r60 = r19
            r61 = r15
            r28 = r0
            r29 = r1
            r30 = r4
            r31 = r10
            r34 = r9
            r35 = r16
            r36 = r26
            r37 = r17
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)
            r9.A0J = r0
            r9.A0k = r6
            com.whatsapp.mediacomposer.doodle.DoodleView r0 = r0.A0P
            if (r0 == 0) goto L_0x01dd
            r9.A2O(r0)
        L_0x01dd:
            r0 = 2131432365(0x7f0b13ad, float:1.8486485E38)
            android.widget.ImageView r0 = X.AnonymousClass3MW.A0H(r10, r0)
            if (r0 == 0) goto L_0x01ea
            r9.A2O(r0)
            r8 = r0
        L_0x01ea:
            r9.A03 = r8
            boolean r0 = r9.A2U()
            if (r0 != 0) goto L_0x01f8
            boolean r0 = r9.A2V()
            if (r0 == 0) goto L_0x0210
        L_0x01f8:
            r0 = 2131428829(0x7f0b05dd, float:1.8479314E38)
            android.view.View r1 = r10.findViewById(r0)
            if (r1 == 0) goto L_0x0210
            r9.A2O(r1)
            boolean r0 = r9.A2U()
            if (r0 != 0) goto L_0x024e
            boolean r0 = r9.A2V()
            if (r0 != 0) goto L_0x024e
        L_0x0210:
            X.00H r0 = r9.A2B()
            X.0ve r1 = X.C108955ca.A0R(r0)
            if (r7 != 0) goto L_0x024b
            if (r5 == 0) goto L_0x024b
            r0 = 8644(0x21c4, float:1.2113E-41)
        L_0x021e:
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131430766(0x7f0b0d6e, float:1.8483242E38)
            android.view.View r1 = X.AnonymousClass3MX.A0C(r10, r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 22
            X.7gh r0 = X.C108945cZ.A1K(r9, r0)
            X.78w r3 = new X.78w
            r3.<init>(r10, r1, r0)
            X.6c8 r2 = new X.6c8
            r2.<init>(r9)
            java.util.List r1 = r3.A08
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L_0x0248
            r1.add(r2)
        L_0x0248:
            r9.A0K = r3
        L_0x024a:
            return
        L_0x024b:
            r0 = 8807(0x2267, float:1.2341E-41)
            goto L_0x021e
        L_0x024e:
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof X.C39151sZ
            if (r0 == 0) goto L_0x0210
            X.1sZ r1 = (X.C39151sZ) r1
            if (r1 == 0) goto L_0x0210
            java.lang.String r0 = "9:16"
            r1.A0t = r0
            boolean r0 = r9.A2U()
            if (r0 == 0) goto L_0x0210
            r0 = 0
            r1.A08 = r0
            goto L_0x0210
        L_0x0268:
            r0 = 8644(0x21c4, float:1.2113E-41)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x014e
        L_0x0270:
            r62 = 1
            goto L_0x0150
        L_0x0274:
            r0 = 1
            goto L_0x00f8
        L_0x0277:
            if (r5 == 0) goto L_0x0288
            r0 = r9
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = (com.whatsapp.mediacomposer.ImageComposerFragment) r0
            X.0vl r0 = r0.A0G
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout r0 = (com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout) r0
            X.77s r4 = r0.A02
            goto L_0x00fd
        L_0x0288:
            X.697 r4 = new X.697
            r4.<init>()
            goto L_0x00fd
        L_0x028f:
            if (r4 == 0) goto L_0x02a4
            X.00H r0 = r9.A2B()
            X.0ve r2 = X.C108955ca.A0R(r0)
            r1 = 11003(0x2afb, float:1.5418E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r4 = 1
            if (r0 != 0) goto L_0x006f
        L_0x02a4:
            r4 = 0
            goto L_0x0068
        L_0x02a7:
            X.696 r6 = new X.696
            r6.<init>((com.whatsapp.mediacomposer.VideoComposerFragment) r1)
            goto L_0x005e
        L_0x02ae:
            boolean r0 = r9 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x02bc
            r0 = r9
            com.whatsapp.mediacomposer.ImageComposerFragment r0 = (com.whatsapp.mediacomposer.ImageComposerFragment) r0
            X.696 r6 = new X.696
            r6.<init>((com.whatsapp.mediacomposer.ImageComposerFragment) r0)
            goto L_0x005e
        L_0x02bc:
            r0 = r9
            com.whatsapp.mediacomposer.GifComposerFragment r0 = (com.whatsapp.mediacomposer.GifComposerFragment) r0
            X.696 r6 = new X.696
            r6.<init>((com.whatsapp.mediacomposer.GifComposerFragment) r0)
            goto L_0x005e
        L_0x02c6:
            r0 = 0
            goto L_0x0033
        L_0x02c9:
            r0 = 0
            goto L_0x0027
        L_0x02cc:
            r0 = r8
            goto L_0x001a
        L_0x02cf:
            java.lang.String r0 = "templateComposerControllerFactory"
            X.C18070vi.A11(r0)
            throw r8
        L_0x02d5:
            java.lang.String r0 = "doodleFactory"
            X.C18070vi.A11(r0)
            throw r8
        L_0x02db:
            java.lang.String r0 = "time"
            X.C18070vi.A11(r0)
            throw r8
        L_0x02e1:
            java.lang.String r0 = "shapeStickerLayoutDataProvider"
            X.C18070vi.A11(r0)
            throw r8
        L_0x02e7:
            java.lang.String r0 = "mediaSharingUserJourneyLogger"
            X.C18070vi.A11(r0)
            throw r8
        L_0x02ed:
            java.lang.String r0 = "colorPickerStateManagerFactory"
            X.C18070vi.A11(r0)
            throw r8
        L_0x02f3:
            java.lang.String r0 = "expressionsTrayControllerLazy"
            X.C18070vi.A11(r0)
            throw r8
        L_0x02f9:
            java.lang.String r0 = "expressionsShapeCreatorLazy"
            X.C18070vi.A11(r0)
            throw r8
        L_0x02ff:
            java.lang.String r0 = "stickerImageFileLoader"
            X.C18070vi.A11(r0)
            throw r8
        L_0x0305:
            java.lang.String r0 = "shapeDictionaryStore"
            X.C18070vi.A11(r0)
            throw r8
        L_0x030b:
            java.lang.String r0 = "waSharedPreferences"
            X.C18070vi.A11(r0)
            throw r8
        L_0x0311:
            java.lang.String r0 = "shapeSearchProvider"
            X.C18070vi.A11(r0)
            throw r8
        L_0x0317:
            java.lang.String r0 = "stickerRepository"
            X.C18070vi.A11(r0)
            throw r8
        L_0x031d:
            java.lang.String r0 = "stickerObservers"
            X.C18070vi.A11(r0)
            throw r8
        L_0x0323:
            X.AnonymousClass3MW.A1M()
            throw r8
        L_0x0327:
            X.AnonymousClass3MW.A1N()
            throw r8
        L_0x032b:
            java.lang.String r0 = "recentShapes"
            X.C18070vi.A11(r0)
            throw r8
        L_0x0331:
            java.lang.String r0 = "emojiLoader"
            X.C18070vi.A11(r0)
            throw r8
        L_0x0337:
            X.AnonymousClass3MW.A1G()
            throw r8
        L_0x033b:
            java.lang.String r0 = "imeUtils"
            X.C18070vi.A11(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.A21(android.os.Bundle, android.view.View):void");
    }

    public Bitmap A26() {
        return null;
    }

    public final Bitmap A27(Bitmap bitmap) {
        Uri uri;
        AnonymousClass77N r1;
        Integer num;
        Integer num2;
        Integer num3;
        C160888Ai A29;
        Bitmap bitmap2 = bitmap;
        C18070vi.A0d(bitmap, 0);
        try {
            Context A1n = A1n();
            if (A1n == null || (uri = this.A01) == null) {
                return null;
            }
            C160888Ai A292 = A29();
            if (A292 != null) {
                r1 = ((MediaComposerActivity) A292).A0L;
            } else {
                r1 = null;
            }
            C138786xg r3 = C138786xg.A00;
            C24641Lc r6 = (C24641Lc) C18070vi.A0E(A2B());
            boolean A2V = A2V();
            if (r1 != null) {
                num = r1.A04;
            } else {
                num = null;
            }
            if (r1 != null) {
                num2 = r1.A03;
            } else {
                num2 = null;
            }
            if (r1 != null) {
                num3 = r1.A02;
            } else {
                num3 = null;
            }
            C126436cj A002 = r3.A00(A1n, bitmap2, r6, (Integer) null, (Integer) null, num, num2, num3, A2V);
            if (!(A002 instanceof AnonymousClass6GH)) {
                if (A002 instanceof AnonymousClass6GI) {
                    C160888Ai A293 = A29();
                    if (A293 != null) {
                        C127826ez r32 = ((AnonymousClass6GI) A002).A00;
                        A293.CI4(uri, Integer.valueOf(r32.A01), Integer.valueOf(r32.A00), (Integer) null);
                    }
                } else if ((A002 instanceof AnonymousClass6GJ) && (A29 = A29()) != null) {
                    A29.CI4(uri, (Integer) null, (Integer) null, Integer.valueOf(((AnonymousClass6GJ) A002).A00));
                }
            }
            return A002.A00;
        } catch (OutOfMemoryException e) {
            Log.e("MediaComposerFragment/generateGradientBitmap", e);
            return null;
        }
    }

    public void A2C() {
        this.A0m = false;
        this.A0I = null;
    }

    public abstract void A2K();

    public final void A2O(View view) {
        C18070vi.A0d(view, 0);
        if (A2U()) {
            AnonymousClass4aO.A01(Matrix.ScaleToFit.CENTER, view, VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT, VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH, C43531zx.A00(view, 8));
        }
    }

    public void A2P(AnonymousClass7JS r5, AnonymousClass7JN r6, C136986uj r7) {
        int i;
        Intent intent;
        this.A0m = C18070vi.A17(r7, r6);
        AnonymousClass7JF r2 = this.A0J;
        if (r2 != null) {
            C136986uj r1 = r2.A0W;
            r1.A04 = r2.A0J;
            r1.A05 = r2;
        }
        this.A0I = r6;
        AnonymousClass1FL A1B = A1B();
        if ((A1B == null || (intent = A1B.getIntent()) == null || !intent.getBooleanExtra("disable_tools_for_newsletter_forward", false)) && (this instanceof ImageComposerFragment)) {
            i = 0;
        } else {
            i = 8;
        }
        r7.A0I.setCropToolVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r2 == 180) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onConfigurationChanged(android.content.res.Configuration r6) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            super.onConfigurationChanged(r6)
            X.11C r0 = r5.A09
            if (r0 == 0) goto L_0x00a6
            android.content.Context r1 = r5.A14()
            java.lang.String r0 = "window"
            java.lang.Object r0 = X.AnonymousClass11C.A02(r1, r0)
            X.C17960vV.A07(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            X.C18070vi.A0X(r0)
            android.view.Display r0 = r0.getDefaultDisplay()
            int r2 = r0.getRotation()
            X.78w r0 = r5.A0K
            if (r0 == 0) goto L_0x004b
            android.widget.FrameLayout r0 = r0.A03
            if (r0 == 0) goto L_0x004b
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x004b
            r1 = 11
            X.793 r0 = new X.793
            r0.<init>(r5, r1)
            r5.A02 = r0
            android.view.View r0 = r5.A0B
            if (r0 == 0) goto L_0x004b
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            if (r1 == 0) goto L_0x004b
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r5.A02
            r1.addOnGlobalLayoutListener(r0)
        L_0x004b:
            X.7JF r4 = r5.A0J
            if (r4 == 0) goto L_0x00a3
            int r1 = r6.orientation
            r0 = 2
            if (r1 != r0) goto L_0x005b
            if (r2 == 0) goto L_0x005b
            r0 = 180(0xb4, float:2.52E-43)
            r1 = 1
            if (r2 != r0) goto L_0x005c
        L_0x005b:
            r1 = 0
        L_0x005c:
            boolean r0 = r4.A05
            if (r0 == r1) goto L_0x00a3
            r4.A05 = r1
            X.AnonymousClass7JF.A04(r4)
            X.5d1 r0 = r4.A04
            if (r0 == 0) goto L_0x00a3
            boolean r1 = r0.isShowing()
            r0 = 1
            if (r1 != r0) goto L_0x00a3
            X.5d1 r3 = r4.A04
            if (r3 == 0) goto L_0x00a3
            android.view.View r0 = r4.A09
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r0)
            r0 = 2131625145(0x7f0e04b9, float:1.887749E38)
            android.view.View r1 = X.AnonymousClass3MY.A0D(r1, r0)
            r0 = 2131432239(0x7f0b132f, float:1.848623E38)
            android.view.View r2 = X.AnonymousClass3MX.A0C(r1, r0)
            com.whatsapp.mediacomposer.doodle.textentry.TextEntryView r2 = (com.whatsapp.mediacomposer.doodle.textentry.TextEntryView) r2
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x00a4
            X.6uj r0 = r4.A0W
            android.graphics.Rect r0 = r0.A03
            int r1 = r0.top
        L_0x0094:
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r3.A02 = r2
            r3.A00 = r1
            X.7JH r0 = r3.A03
            r0.A02 = r2
            X.C109225d1.A00(r3)
        L_0x00a3:
            return
        L_0x00a4:
            r1 = 0
            goto L_0x0094
        L_0x00a6:
            X.AnonymousClass3MW.A1N()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.onConfigurationChanged(android.content.res.Configuration):void");
    }

    public static final Intent A0I(Context context, MediaComposerFragment mediaComposerFragment) {
        String str;
        String str2;
        AnonymousClass689 r0 = mediaComposerFragment.A0H;
        if (r0 != null) {
            boolean A062 = r0.A06(context);
            AnonymousClass00H r02 = mediaComposerFragment.A0g;
            if (r02 != null) {
                r02.get();
                Intent A0A2 = C17880vN.A0A();
                A0A2.putExtra("mode", 1);
                String packageName = context.getPackageName();
                if (A062) {
                    str2 = "com.whatsapp.location.LocationPicker2";
                } else {
                    str2 = "com.whatsapp.location.LocationPicker";
                }
                A0A2.setClassName(packageName, str2);
                return A0A2;
            }
            str = "waIntents";
        } else {
            str = "locationUtils";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1K() {
        AnonymousClass7JF r2 = this.A0J;
        if (r2 != null) {
            r2.A0L.A05(false);
            r2.A0J.A00();
        }
        super.A1K();
    }

    public void A1s() {
        C160888Ai A29;
        C136986uj A0U2;
        C136926ud r2 = this.A0k;
        if (!(r2 == null || (A29 = A29()) == null || (A0U2 = C108955ca.A0U((MediaComposerActivity) A29)) == null || A0U2.A04 != r2)) {
            A0U2.A04 = null;
        }
        this.A03 = null;
        AnonymousClass7JF r4 = this.A0J;
        if (r4 != null) {
            DoodleView doodleView = r4.A0P;
            C1410073x r1 = doodleView.A0J;
            Bitmap bitmap = r1.A07;
            if (bitmap != null) {
                bitmap.recycle();
            }
            r1.A07 = null;
            Bitmap bitmap2 = r1.A08;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            r1.A08 = null;
            Bitmap bitmap3 = r1.A06;
            if (bitmap3 != null) {
                bitmap3.recycle();
                r1.A06 = null;
            }
            Bitmap bitmap4 = r1.A05;
            if (bitmap4 != null) {
                bitmap4.recycle();
                r1.A05 = null;
            }
            doodleView.setEnabled(false);
            r4.A08.removeCallbacksAndMessages((Object) null);
            C18150vq r12 = r4.A0a;
            if (r12.A03()) {
                AnonymousClass72m r22 = (AnonymousClass72m) r12.get();
                C17890vO.A0t(r22.A02);
                r22.A06.quit();
                r22.A0J.removeMessages(0);
                r22.A0c.clear();
                r22.A0R.A00 = null;
                r22.A0V.unregisterObserver(r22.A0U);
                r22.A0Q.A02();
            }
            r4.A0W.A0I.setToolbarExtraVisibility(8);
        }
        this.A01 = null;
        super.A1s();
    }

    public final C18030ve A28() {
        C18030ve r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1A();
        throw null;
    }

    public C135806sn A2A() {
        AnonymousClass7JF r0;
        DoodleView doodleView;
        AnonymousClass69K A012;
        if (!(this instanceof ImageComposerFragment) || (r0 = this.A0J) == null || (doodleView = r0.A0P) == null || (A012 = doodleView.A0M.A01()) == null) {
            return null;
        }
        float f = doodleView.A0K.A00;
        return new C135806sn(f * A012.A00, f * A012.A01, A012.A03, A012.A02);
    }

    public final AnonymousClass00H A2B() {
        AnonymousClass00H r0 = this.A0c;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statusConfig");
        throw null;
    }

    public void A2D() {
        View A092;
        Intent intent;
        DoodleView doodleView;
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            if (videoComposerFragment.A0j) {
                VideoComposerFragment.A09(videoComposerFragment);
            } else {
                videoComposerFragment.A0a = new C151937n6(videoComposerFragment);
            }
        } else if (this instanceof ImageComposerFragment) {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            PhotoView photoView = imageComposerFragment.A06;
            if (photoView != null) {
                photoView.setVisibility(0);
            }
            AnonymousClass7JF r0 = imageComposerFragment.A0J;
            if (!(r0 == null || (doodleView = r0.A0P) == null)) {
                doodleView.setVisibility(0);
            }
            AnonymousClass1FL A1B = imageComposerFragment.A1B();
            if (A1B != null && (intent = A1B.getIntent()) != null && intent.getIntExtra("origin", 1) == 29) {
                AnonymousClass1KB r2 = imageComposerFragment.A07;
                if (r2 != null) {
                    r2.A0J(new AnonymousClass7RA((Object) imageComposerFragment, 41));
                } else {
                    AnonymousClass3MW.A1C();
                    throw null;
                }
            }
        } else {
            GifComposerFragment gifComposerFragment = (GifComposerFragment) this;
            if (gifComposerFragment.A0j) {
                AnonymousClass70X r02 = gifComposerFragment.A00;
                if (r02 != null && (A092 = r02.A09()) != null) {
                    A092.setAlpha(1.0f);
                    A092.setVisibility(0);
                    return;
                }
                return;
            }
            gifComposerFragment.A02 = new C151567mV(gifComposerFragment);
        }
    }

    public void A2E() {
        Intent intent;
        DoodleView doodleView;
        if (this instanceof ImageComposerFragment) {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            PhotoView photoView = imageComposerFragment.A06;
            if (photoView != null) {
                photoView.setVisibility(4);
            }
            AnonymousClass7JF r0 = imageComposerFragment.A0J;
            if (!(r0 == null || (doodleView = r0.A0P) == null)) {
                doodleView.setVisibility(4);
            }
            AnonymousClass1FL A1B = imageComposerFragment.A1B();
            if (A1B != null && (intent = A1B.getIntent()) != null && intent.getIntExtra("origin", 1) == 29) {
                ImageComposerFragment.A0B(imageComposerFragment, false, true);
            }
        }
    }

    public void A2F() {
        AnonymousClass7JN r1 = this.A0I;
        if (r1 != null && !r1.A02) {
            r1.A03();
        }
    }

    public void A2G() {
        AnonymousClass7JN r0 = this.A0I;
        if (r0 != null) {
            r0.A04();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r10 = (com.whatsapp.mediacomposer.VideoComposerFragment) r14;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2H() {
        /*
            r14 = this;
            boolean r0 = r14 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x0075
            r10 = r14
            com.whatsapp.mediacomposer.VideoComposerFragment r10 = (com.whatsapp.mediacomposer.VideoComposerFragment) r10
            android.widget.ImageView r4 = r10.A0H
            if (r4 == 0) goto L_0x0075
            boolean r1 = r10.A0g
            r0 = 2131231941(0x7f0804c5, float:1.8079977E38)
            if (r1 == 0) goto L_0x0015
            r0 = 2131231942(0x7f0804c6, float:1.807998E38)
        L_0x0015:
            r4.setImageResource(r0)
            X.0vl r0 = r10.A0v
            X.5iM r0 = X.C108945cZ.A0n(r0)
            android.net.Uri r1 = r10.A01
            X.0vl r0 = r0.A0B
            java.util.Map r0 = X.AnonymousClass3MW.A12(r0)
            boolean r0 = r0.containsKey(r1)
            r9 = 0
            if (r0 != 0) goto L_0x0076
            X.1A3 r1 = r10.A0S
            java.lang.Object r0 = r1.A00
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r1.A00()
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            if (r0 == 0) goto L_0x0076
        L_0x003d:
            r13 = 1
        L_0x003e:
            long r6 = r10.A07
            long r0 = r10.A06
            long r6 = r6 - r0
            r11 = 7000(0x1b58, double:3.4585E-320)
            r8 = 8
            r5 = 0
            r2 = 100
            int r0 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0078
            boolean r0 = r10.A0f
            if (r0 != 0) goto L_0x0078
            if (r13 == 0) goto L_0x0078
            int r0 = r4.getVisibility()
            if (r0 != r8) goto L_0x006d
            r4.measure(r9, r9)
            int r0 = r4.getMeasuredWidth()
            float r1 = (float) r0
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            r0.<init>(r1, r5, r5, r5)
            r0.setDuration(r2)
            r4.startAnimation(r0)
        L_0x006d:
            android.view.View$OnClickListener r0 = r10.A0o
            r4.setOnClickListener(r0)
            r4.setVisibility(r9)
        L_0x0075:
            return
        L_0x0076:
            r13 = 0
            goto L_0x003e
        L_0x0078:
            int r0 = r4.getVisibility()
            if (r0 != 0) goto L_0x008e
            int r0 = r4.getMeasuredWidth()
            float r1 = (float) r0
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            r0.<init>(r5, r1, r5, r5)
            r0.setDuration(r2)
            r4.startAnimation(r0)
        L_0x008e:
            r0 = 0
            r4.setOnClickListener(r0)
            r4.setVisibility(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.A2H():void");
    }

    public void A2I() {
        C18090vk r0 = this.A0h;
        if (r0 != null) {
            r0.invoke();
        }
        this.A0h = null;
        this.A0j = true;
        Log.i("MediaComposerFragment/notifyWhenViewIsReady/View is now ready");
    }

    public final void A2J() {
        C109225d1 r0;
        AnonymousClass7JF r3 = this.A0J;
        if (r3 != null) {
            r3.A05 = AnonymousClass000.A1T(C72453Mb.A08(A14()), 2);
            C136986uj r2 = r3.A0W;
            r2.A01 = r3.A0M.A00;
            int i = 0;
            r3.A0L.A05(false);
            r3.A0J.A00();
            if (!AnonymousClass000.A1a(r3.A0V.A03.A00)) {
                i = 4;
            }
            r2.A08(i);
            AnonymousClass7JF.A04(r3);
            AnonymousClass7JF.A05(r3);
            C109225d1 r02 = r3.A04;
            if (r02 != null && r02.isShowing() && (r0 = r3.A04) != null) {
                r0.A01();
            }
        }
    }

    public void A2L(float f, boolean z) {
        AnonymousClass7JF r0;
        ViewPropertyAnimator animate;
        ViewPropertyAnimator scaleX;
        ViewPropertyAnimator scaleY;
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            AnonymousClass70X r02 = videoComposerFragment.A0W;
            View view = null;
            if (r02 != null) {
                view = r02.A09();
            }
            ImageView imageView = videoComposerFragment.A03;
            if (z) {
                if (!(imageView == null || (animate = imageView.animate()) == null || (scaleX = animate.scaleX(f)) == null || (scaleY = scaleX.scaleY(f)) == null)) {
                    scaleY.setDuration(200);
                }
                C109005cf.A0R(view, f);
                AnonymousClass7JF r03 = videoComposerFragment.A0J;
                if (r03 != null) {
                    C109005cf.A0R(r03.A0P, f);
                    return;
                }
                return;
            }
            if (imageView != null) {
                imageView.setScaleX(f);
                imageView.setScaleY(f);
            }
            if (view != null) {
                view.setScaleX(f);
                view.setScaleY(f);
            }
            r0 = videoComposerFragment.A0J;
        } else if (this instanceof ImageComposerFragment) {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            ImagePreviewContentLayout imagePreviewContentLayout = (ImagePreviewContentLayout) AnonymousClass3MX.A14(imageComposerFragment.A0G);
            if (z) {
                imagePreviewContentLayout.animate().scaleX(f).scaleY(f).setDuration(200);
                AnonymousClass7JF r04 = imageComposerFragment.A0J;
                if (r04 != null) {
                    C109005cf.A0R(r04.A0P, f);
                    return;
                }
                return;
            }
            imagePreviewContentLayout.setScaleX(f);
            imagePreviewContentLayout.setScaleY(f);
            r0 = imageComposerFragment.A0J;
        } else {
            return;
        }
        if (r0 != null) {
            DoodleView doodleView = r0.A0P;
            doodleView.setScaleX(f);
            doodleView.setScaleY(f);
        }
    }

    public void A2M(int i, boolean z) {
        View A092;
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            AnonymousClass70X r0 = videoComposerFragment.A0W;
            if (r0 != null && (A092 = r0.A09()) != null) {
                float bottom = (float) A092.getBottom();
                float f = 1.0f - ((bottom - ((float) i)) / bottom);
                float f2 = 1.0f;
                if (1.0f > f) {
                    f2 = f;
                }
                float A022 = C108945cZ.A02(A092.getWidth());
                ImageView imageView = videoComposerFragment.A03;
                if (imageView != null) {
                    imageView.setPivotX(A022);
                    imageView.setPivotY(0.0f);
                }
                A092.setPivotX(A022);
                A092.setPivotY(0.0f);
                AnonymousClass7JF r02 = videoComposerFragment.A0J;
                if (r02 != null) {
                    DoodleView doodleView = r02.A0P;
                    doodleView.setPivotX(A022);
                    doodleView.setPivotY(0.0f);
                }
                videoComposerFragment.A2L(f2, z);
            }
        } else if (this instanceof ImageComposerFragment) {
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            C18100vl r6 = imageComposerFragment.A0G;
            float bottom2 = (float) ((ImagePreviewContentLayout) AnonymousClass3MX.A14(r6)).getBottom();
            float f3 = 1.0f - ((bottom2 - ((float) i)) / bottom2);
            if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            ImagePreviewContentLayout imagePreviewContentLayout = (ImagePreviewContentLayout) AnonymousClass3MX.A14(r6);
            imagePreviewContentLayout.setPivotY(0.0f);
            imagePreviewContentLayout.setPivotX(C108945cZ.A02(imagePreviewContentLayout.getWidth()));
            AnonymousClass7JF r3 = imageComposerFragment.A0J;
            if (r3 != null) {
                float pivotX = ((ImagePreviewContentLayout) AnonymousClass3MX.A14(r6)).getPivotX();
                float pivotY = ((ImagePreviewContentLayout) AnonymousClass3MX.A14(r6)).getPivotY();
                DoodleView doodleView2 = r3.A0P;
                doodleView2.setPivotX(pivotX);
                doodleView2.setPivotY(pivotY);
            }
            imageComposerFragment.A2L(f3, z);
        }
    }

    public void A2N(Rect rect) {
        AnonymousClass7JF r5;
        if (this.A0B != null && rect != null && (r5 = this.A0J) != null) {
            View view = r5.A0X.A03;
            ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(view);
            A0B2.leftMargin = rect.left;
            A0B2.topMargin = rect.top;
            A0B2.rightMargin = rect.right;
            A0B2.bottomMargin = rect.bottom;
            view.setLayoutParams(A0B2);
            r5.A0L.setInsets(rect);
            C18150vq r1 = r5.A0a;
            if (r1.A03()) {
                ((AnonymousClass72m) r1.get()).A0Q.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            }
            r5.A07.set(rect);
        }
    }

    public void A2Q(boolean z) {
        Integer num;
        List list;
        int i;
        int captionTop;
        CaptionFragment captionFragment;
        int i2;
        AnonymousClass00H r0 = this.A0f;
        if (r0 != null) {
            AnonymousClass4Ql r3 = (AnonymousClass4Ql) r0.get();
            AnonymousClass1GP A1E = A1E();
            C160888Ai A29 = A29();
            String str = null;
            if (A29 != null) {
                MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A29;
                C109235d2 r02 = mediaComposerActivity.A0b;
                if (r02 == null || (captionFragment = r02.A03) == null || captionFragment.A26().getCaptionTop() == 0) {
                    captionTop = AnonymousClass7JN.A00(mediaComposerActivity).getCaptionTop();
                } else {
                    int captionTop2 = AnonymousClass7JN.A00(mediaComposerActivity).getCaptionTop();
                    CaptionFragment captionFragment2 = mediaComposerActivity.A0b.A03;
                    if (captionFragment2 != null) {
                        i2 = captionFragment2.A26().getCaptionTop();
                    } else {
                        i2 = 0;
                    }
                    captionTop = Math.min(captionTop2, i2);
                }
                num = Integer.valueOf(captionTop);
            } else {
                num = null;
            }
            C160888Ai A292 = A29();
            if (A292 != null) {
                list = MediaJidViewModel.A04((MediaComposerActivity) A292);
            } else {
                list = null;
            }
            boolean z2 = this instanceof VideoComposerFragment;
            Context A1n = A1n();
            if (A1n != null) {
                if (z2) {
                    i = 2131897954;
                } else if (this instanceof ImageComposerFragment) {
                    i = 2131897935;
                } else {
                    i = 0;
                }
                str = A1n.getString(i);
            }
            r3.A00(A1E, num, str, list, z, z2);
            return;
        }
        C18070vi.A11("viewOnceUIHelper");
        throw null;
    }

    public void A2R(boolean z) {
        if (this instanceof VideoComposerFragment) {
            VideoComposerFragment videoComposerFragment = (VideoComposerFragment) this;
            videoComposerFragment.A0S = new AnonymousClass1A3(Boolean.valueOf(z));
            ImageView imageView = videoComposerFragment.A0H;
            if (imageView != null) {
                imageView.setVisibility(C72453Mb.A07(z ? 1 : 0));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00a9, code lost:
        r1 = r2.A0H;
     */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0065 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A2S() {
        /*
            r5 = this;
            X.78w r1 = r5.A0K
            if (r1 == 0) goto L_0x0099
            android.widget.FrameLayout r0 = r1.A03
            if (r0 == 0) goto L_0x0099
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0099
            android.widget.FrameLayout r0 = r1.A03
            if (r0 == 0) goto L_0x00c2
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00c2
            X.C1422878w.A00(r1)
            java.util.List r0 = r1.A08
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x0025:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r0 = r4.next()
            X.6c8 r0 = (X.C126066c8) r0
            com.whatsapp.mediacomposer.MediaComposerFragment r3 = r0.A00
            r3.A2F()
            X.7JN r1 = r3.A0I
            if (r1 == 0) goto L_0x0041
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0041
            r1.A03()
        L_0x0041:
            int r1 = r3.A00
            if (r1 == 0) goto L_0x006b
            r0 = 1
            if (r1 == r0) goto L_0x0083
            r0 = 2
            if (r1 != r0) goto L_0x0065
            X.7JF r0 = r3.A0J
            if (r0 == 0) goto L_0x0054
            com.whatsapp.mediacomposer.doodle.ColorPickerComponent r0 = r0.A0L
            r0.A03()
        L_0x0054:
            X.8Ai r0 = r3.A29()
            if (r0 == 0) goto L_0x0065
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.6uj r0 = X.C108955ca.A0U(r0)
            if (r0 == 0) goto L_0x0065
            r0.A04()
        L_0x0065:
            X.1Wu r0 = X.C27621Wu.A00
            r2.add(r0)
            goto L_0x0025
        L_0x006b:
            X.7JF r1 = r3.A0J
            if (r1 == 0) goto L_0x0065
            X.5d1 r0 = r1.A04
            if (r0 == 0) goto L_0x0065
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0065
            X.5d1 r0 = r1.A04
            if (r0 == 0) goto L_0x0080
            r0.A01()
        L_0x0080:
            X.5d1 r0 = r1.A04
            goto L_0x0093
        L_0x0083:
            X.7JF r1 = r3.A0J
            if (r1 == 0) goto L_0x0065
            X.5cz r0 = r1.A03
            if (r0 == 0) goto L_0x0065
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0065
            X.5cz r0 = r1.A03
        L_0x0093:
            if (r0 == 0) goto L_0x0065
            r0.show()
            goto L_0x0065
        L_0x0099:
            X.7JF r2 = r5.A0J
            if (r2 == 0) goto L_0x0122
            X.0ve r3 = r2.A0I
            X.0vf r1 = X.C18040vf.A01
            r0 = 5976(0x1758, float:8.374E-42)
            boolean r0 = X.C18020vd.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x00c4
            X.74J r1 = r2.A0H
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = r1.A0E
            if (r0 == 0) goto L_0x00c4
            int r0 = r0.getVisibility()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x00c4
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x00c4
            r1.A0D()
        L_0x00c2:
            r0 = 1
            return r0
        L_0x00c4:
            boolean r0 = X.AnonymousClass7JF.A08(r2)
            r4 = 0
            if (r0 != 0) goto L_0x00dc
            X.6uj r3 = r2.A0W
            X.7JS r0 = r3.A0G
            int r1 = r0.A09()
            r0 = 2
            if (r1 != r0) goto L_0x0122
            r3.A07(r4)
            r2.A0A()
        L_0x00dc:
            X.0vq r0 = r2.A0a
            java.lang.Object r0 = r0.get()
            X.72m r0 = (X.AnonymousClass72m) r0
            X.71R r3 = r0.A0M
            com.whatsapp.ClearableEditText r1 = r3.A0A
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x00f9
            X.AnonymousClass3MW.A1S(r1)
        L_0x00f1:
            X.5iA r0 = r3.A0C
            X.1vp r0 = r0.A00
            X.AnonymousClass3MY.A1L(r0, r4)
            goto L_0x00c2
        L_0x00f9:
            android.animation.ValueAnimator r0 = r3.A01
            if (r0 == 0) goto L_0x0112
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0112
            android.animation.ValueAnimator r0 = r3.A01
            long r1 = r0.getCurrentPlayTime()
            android.animation.ValueAnimator r0 = r3.A01
            r0.cancel()
            X.AnonymousClass71R.A01(r3, r1, r4)
            goto L_0x00f1
        L_0x0112:
            X.6uj r1 = r2.A0W
            com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView r0 = r1.A0I
            r0.setBackButtonDrawable(r4)
            float r0 = r1.A00
            r1.A05(r0)
            X.AnonymousClass7JF.A00(r2)
            goto L_0x00c2
        L_0x0122:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.A2S():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r0.A0a() == true) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A2T() {
        /*
            r5 = this;
            boolean r0 = r5 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r0 == 0) goto L_0x004d
            r4 = r5
            com.whatsapp.mediacomposer.VideoComposerFragment r4 = (com.whatsapp.mediacomposer.VideoComposerFragment) r4
            X.70X r0 = r4.A0W
            r1 = 0
            if (r0 == 0) goto L_0x004b
            boolean r0 = r0.A0a()
            r3 = 1
            if (r0 != r3) goto L_0x004b
        L_0x0013:
            X.70X r0 = r4.A0W
            if (r0 == 0) goto L_0x0021
            r0.A0B()
            android.view.View r0 = r0.A09()
            r0.setKeepScreenOn(r1)
        L_0x0021:
            X.70X r0 = r4.A0W
            if (r0 == 0) goto L_0x0048
            int r0 = r0.A05()
            long r0 = (long) r0
        L_0x002a:
            r4.A05 = r0
            X.7JF r0 = r4.A0J
            if (r0 == 0) goto L_0x003a
            com.whatsapp.mediacomposer.doodle.DoodleView r2 = r0.A0P
            X.73x r1 = r2.A0J
            r0 = 0
            r1.A0A = r0
            r2.invalidate()
        L_0x003a:
            boolean r0 = com.whatsapp.mediacomposer.VideoComposerFragment.A0F(r4)
            if (r0 != 0) goto L_0x0047
            android.view.View r2 = r4.A09
            r0 = 200(0xc8, double:9.9E-322)
            com.whatsapp.mediacomposer.VideoComposerFragment.A07(r2, r0)
        L_0x0047:
            return r3
        L_0x0048:
            r0 = 0
            goto L_0x002a
        L_0x004b:
            r3 = 0
            goto L_0x0013
        L_0x004d:
            boolean r0 = r5 instanceof com.whatsapp.mediacomposer.ImageComposerFragment
            if (r0 == 0) goto L_0x0053
            r0 = 0
            return r0
        L_0x0053:
            r3 = r5
            com.whatsapp.mediacomposer.GifComposerFragment r3 = (com.whatsapp.mediacomposer.GifComposerFragment) r3
            X.70X r0 = r3.A00
            r2 = 0
            if (r0 == 0) goto L_0x0065
            r0.A0B()
            android.view.View r0 = r0.A09()
            r0.setKeepScreenOn(r2)
        L_0x0065:
            X.7JF r0 = r3.A0J
            if (r0 == 0) goto L_0x0072
            com.whatsapp.mediacomposer.doodle.DoodleView r1 = r0.A0P
            X.73x r0 = r1.A0J
            r0.A0A = r2
            r1.invalidate()
        L_0x0072:
            X.70X r0 = r3.A00
            if (r0 == 0) goto L_0x007a
            boolean r2 = r0.A0a()
        L_0x007a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.MediaComposerFragment.A2T():boolean");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.02h] */
    public MediaComposerFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(MediaJidViewModel.class);
        this.A0o = C99274sY.A00(new C151817mu(this), new C151827mv(this), new C156207tz(this), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(MediaQualityViewModel.class);
        this.A0p = C99274sY.A00(new C151837mw(this), new C151847mx(this), new C156217u0(this), A152);
        this.A00 = -1;
    }

    public void A23(boolean z) {
        try {
            super.A23(z);
        } catch (NullPointerException unused) {
            AnonymousClass190 r3 = this.A04;
            if (r3 != null) {
                r3.A0G("MediaComposerFragment-visibility-npe", (String) null, true);
            } else {
                C18070vi.A11("crashLogs");
                throw null;
            }
        }
    }

    public final C160888Ai A29() {
        AnonymousClass1FL A1B = A1B();
        if (A1B instanceof C160888Ai) {
            return (C160888Ai) A1B;
        }
        return null;
    }

    public final boolean A2U() {
        AnonymousClass7JS r0;
        C160888Ai A29 = A29();
        if (A29 == null || (r0 = ((MediaComposerActivity) A29).A0X) == null) {
            return false;
        }
        return C108975cc.A1B(C72453Mb.A1a(r0.A0E) ? 1 : 0);
    }

    public final boolean A2V() {
        AnonymousClass77N r0;
        C160888Ai A29 = A29();
        if (A29 == null || (r0 = ((MediaComposerActivity) A29).A0L) == null) {
            return false;
        }
        return C108975cc.A1B(r0.A08 ? 1 : 0);
    }

    public void C5O(C1409773u r5) {
        String str;
        Context A1n = A1n();
        if (A1n != null) {
            Intent A0I2 = A0I(A1n, this);
            if (A1b()) {
                if (C18020vd.A05(C18040vf.A02, A28(), 902)) {
                    C219217x r0 = this.A0C;
                    if (r0 == null) {
                        str = "waPermissionsHelper";
                    } else if (!r0.A06()) {
                        AnonymousClass00H r02 = this.A0g;
                        if (r02 != null) {
                            r02.get();
                            C134126q5 r1 = new C134126q5(A1D());
                            r1.A01 = 2131232061;
                            String[] strArr = C27091Ur.A09;
                            C18070vi.A0Z(strArr);
                            r1.A0C = strArr;
                            r1.A03 = 2131894345;
                            r1.A02 = 2131894346;
                            this.A0n.A02((C1406772n) null, r1.A00());
                            return;
                        }
                        str = "waIntents";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
                startActivityForResult(A0I2, 2);
            }
        }
    }
}
