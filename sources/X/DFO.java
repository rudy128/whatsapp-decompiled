package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.io.IOException;
import java.util.Arrays;
import org.wawebrtc.MediaCodecVideoEncoder;

public abstract class DFO implements C16890tO {
    public final DOZ A00;

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        C22566BDb bDb;
        View view = (View) obj;
        C18070vi.A0h(context, view);
        C26272CwJ.A01(this.A00);
        C26176Ctu.A02("Evaluation Context can only be gotten from the UI Thread");
        if (this instanceof C23686Bnt) {
            C01930Bz r7 = (C01930Bz) view;
            BV9 bv9 = (BV9) obj2;
            if (bv9.A01 == null) {
                return null;
            }
            try {
                DOZ doz = bv9.A03;
                doz.getClass();
                C23686Bnt.A00(doz, bv9.A01, (BV1) r7, bv9);
                Drawable drawable = bv9.A03;
                Drawable drawable2 = bv9.A02;
                if (drawable instanceof Animatable) {
                    ((Animatable) drawable).start();
                }
                if (!(drawable2 instanceof Animatable)) {
                    return null;
                }
                ((Animatable) drawable2).start();
                return null;
            } catch (IOException e) {
                C25913CoX.A00((DOZ) null, "HostWithDecoratorRenderUnit", "Parse exception while binding Box Decoration", e);
                return null;
            }
        } else if (this instanceof C23684Bnr) {
            DFL dfl = ((C23684Bnr) this).A00;
            view.setScaleX(dfl.A03(136, 1.0f));
            view.setScaleY(dfl.A03(137, 1.0f));
            view.setTranslationX(dfl.A03(MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT, 0.0f));
            view.setTranslationY(dfl.A03(145, 0.0f));
            view.setRotation(dfl.A03(138, 0.0f));
            view.setAlpha(dfl.A03(141, 1.0f));
            return null;
        } else if (this instanceof C23685Bns) {
            C23685Bns bns = (C23685Bns) this;
            return bns.A01.A0M(view, bns.A00, ((BV6) obj2).A00, obj3);
        } else {
            C23683Bnq bnq = (C23683Bnq) this;
            DFL dfl2 = (DFL) obj2;
            C18070vi.A0d(dfl2, 2);
            DFL A0O = BE7.A0O(dfl2);
            if (A0O == null || (bDb = (C22566BDb) DOZ.A00(bnq.A00, 2131428192)) == null) {
                return null;
            }
            C22403B6g A002 = C196419v1.A00(A0O, A0O.A05);
            if (bDb instanceof E7K) {
                A002 = new AI1(A002, obj3);
            }
            bDb.BpW(A002);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r8 != r9) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CMV(java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9) {
        /*
            r5 = this;
            X.DOZ r0 = r5.A00
            X.C26272CwJ.A01(r0)
            java.lang.String r0 = "Evaluation Context can only be gotten from the UI Thread"
            X.C26176Ctu.A02(r0)
            r4 = 1
            java.lang.ThreadLocal r3 = X.C24724CHl.A02
            java.lang.Object r2 = r3.get()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.set(r0)
            r1 = r5
            boolean r0 = r5 instanceof X.C23686Bnt     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0022
            X.Bnt r1 = (X.C23686Bnt) r1     // Catch:{ all -> 0x0076 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0076 }
            goto L_0x006e
        L_0x0022:
            boolean r0 = r5 instanceof X.C23684Bnr     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x002c
            java.lang.ThreadLocal r0 = X.C24724CHl.A01     // Catch:{ all -> 0x0076 }
            r0.get()     // Catch:{ all -> 0x0076 }
            goto L_0x006d
        L_0x002c:
            boolean r0 = r5 instanceof X.C23685Bns     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0039
            X.Bns r1 = (X.C23685Bns) r1     // Catch:{ all -> 0x0076 }
            X.BV6 r0 = r1.A01     // Catch:{ all -> 0x0076 }
            boolean r0 = r0.A0P(r8, r9)     // Catch:{ all -> 0x0076 }
            goto L_0x006e
        L_0x0039:
            X.Bnq r1 = (X.C23683Bnq) r1     // Catch:{ all -> 0x0076 }
            X.DFL r6 = (X.DFL) r6     // Catch:{ all -> 0x0076 }
            X.DFL r7 = (X.DFL) r7     // Catch:{ all -> 0x0076 }
            X.C18070vi.A0h(r6, r7)     // Catch:{ all -> 0x0076 }
            X.DOZ r1 = r1.A00     // Catch:{ all -> 0x0076 }
            r0 = 2131428192(0x7f0b0360, float:1.8478022E38)
            java.lang.Object r1 = X.DOZ.A00(r1, r0)     // Catch:{ all -> 0x0076 }
            X.BDb r1 = (X.C22566BDb) r1     // Catch:{ all -> 0x0076 }
            boolean r0 = r1 instanceof X.E7K     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0058
            X.E7K r1 = (X.E7K) r1     // Catch:{ all -> 0x0076 }
            boolean r0 = r1.CMU(r6, r7, r8, r9)     // Catch:{ all -> 0x0076 }
            goto L_0x006e
        L_0x0058:
            r0 = 35
            X.DFL r1 = r6.A09(r0)     // Catch:{ all -> 0x0076 }
            X.DFL r0 = r7.A09(r0)     // Catch:{ all -> 0x0076 }
            if (r1 == 0) goto L_0x006d
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x006d
            r0 = 0
            if (r8 == r9) goto L_0x006e
        L_0x006d:
            r0 = 1
        L_0x006e:
            r3.set(r2)
            if (r0 != 0) goto L_0x0075
            r0 = 0
            return r0
        L_0x0075:
            return r4
        L_0x0076:
            r0 = move-exception
            r3.set(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DFO.CMV(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):boolean");
    }

    public DFO(DOZ doz, long j) {
        this.A00 = doz;
        Class<?> cls = getClass();
        C18070vi.A0d(cls, 1);
        Object[] A1b = AnonymousClass3MW.A1b();
        BE8.A1N(A1b, j);
        A1b[1] = cls;
        Arrays.hashCode(A1b);
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }
}
