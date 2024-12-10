package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.areffects.viewmodel.session.ArEffectSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3ho  reason: invalid class name and case insensitive filesystem */
public final class C75603ho extends BaseArEffectsViewModel {
    public static final AnonymousClass1D6 A0I = new AnonymousClass1D6((Object) null, (Object) null);
    public boolean A00;
    public boolean A01;
    public final ActionFeedbackPriorityQueue A02;
    public final AnonymousClass4D9 A03 = AnonymousClass4D9.PRE_CAPTURE;
    public final C107085Yi A04;
    public final C106555Wh A05;
    public final C106585Wk A06;
    public final AnonymousClass7DY A07;
    public final AnonymousClass00H A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C18100vl A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;
    public final AnonymousClass1G1 A0G;
    public final AnonymousClass118 A0H;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C75603ho(X.C37361pP r18, X.C183829Zt r19, com.whatsapp.areffects.util.ArEffectsGatingUtil r20, X.C106565Wi r21, X.AnonymousClass7DY r22, X.AnonymousClass118 r23, X.C18030ve r24, X.AnonymousClass00H r25, X.AnonymousClass00H r26, X.AnonymousClass00H r27, X.C18600wl r28, X.C18600wl r29) {
        /*
            r17 = this;
            r0 = 1
            r11 = r21
            r12 = r24
            r1 = r28
            X.C72473Md.A1M(r12, r11, r1, r0)
            r2 = r23
            r13 = r25
            r14 = r26
            r0 = r27
            r15 = r29
            X.C18070vi.A0x(r13, r14, r15, r2, r0)
            r3 = 0
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r16 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r7.A0H = r2
            r7.A08 = r0
            r0 = r22
            r7.A07 = r0
            java.lang.Integer r4 = r7.A06
            r0 = 26
            X.0vl r0 = X.C99144sL.A00(r4, r7, r0)
            r7.A0C = r0
            r0 = 29
            X.0vl r0 = X.C99144sL.A00(r4, r7, r0)
            r7.A0F = r0
            X.4D9 r0 = X.AnonymousClass4D9.PRE_CAPTURE
            r7.A03 = r0
            r0 = 10
            X.0vl r0 = X.C99134sK.A00(r4, r7, r12, r0)
            r7.A0A = r0
            r0 = 30
            X.0vl r0 = X.C99144sL.A00(r4, r12, r0)
            r7.A09 = r0
            r1 = 7
            X.4sD r0 = new X.4sD
            r0.<init>(r1)
            X.0vl r0 = X.AnonymousClass1DF.A00(r4, r0)
            r7.A0E = r0
            java.lang.Integer r2 = r7.A07
            r1 = 6
            X.7S3 r0 = new X.7S3
            r0.<init>((java.lang.Object) r7, (int) r1)
            X.0vl r0 = X.AnonymousClass1DF.A00(r2, r0)
            r7.A0D = r0
            r2 = 1
            X.4hX r0 = new X.4hX
            r0.<init>(r7, r2)
            r7.A05 = r0
            X.4hW r0 = new X.4hW
            r0.<init>(r7, r2)
            r7.A04 = r0
            X.4hd r0 = new X.4hd
            r0.<init>(r7, r2)
            r7.A06 = r0
            X.DOd r0 = new X.DOd
            r0.<init>()
            java.util.List r1 = X.C18070vi.A0M(r0)
            com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue r0 = new com.whatsapp.actionfeedback.priorityqueue.ActionFeedbackPriorityQueue
            r0.<init>(r1)
            r7.A02 = r0
            X.1G4 r1 = r7.A0O
            X.4sU r0 = new X.4sU
            r0.<init>(r2)
            X.4sq r2 = X.AnonymousClass4I6.A00(r0, r1)
            X.1OX r5 = r7.A0N
            X.5cA r1 = X.AnonymousClass4ZC.A00
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()
            X.1jt r0 = X.AnonymousClass4Z7.A01(r0, r5, r2, r1)
            r7.A0G = r0
            r0 = 28
            X.0vl r0 = X.C99144sL.A00(r4, r7, r0)
            r7.A0B = r0
            r7.A0b()
            X.0vl r0 = r7.A0G
            java.util.Collection r0 = X.C17890vO.A0g(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x00c1:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r0 = r6.next()
            com.whatsapp.areffects.viewmodel.session.ArEffectSession r0 = (com.whatsapp.areffects.viewmodel.session.ArEffectSession) r0
            X.1G4 r4 = r0.A08
            X.1D6 r2 = A0I
            com.whatsapp.camera.areffects.CameraArEffectsViewModel$1$1 r0 = new com.whatsapp.camera.areffects.CameraArEffectsViewModel$1$1
            r0.<init>(r3)
            X.DXr r1 = new X.DXr
            r1.<init>(r2, r0, r4)
            com.whatsapp.camera.areffects.CameraArEffectsViewModel$1$2 r0 = new com.whatsapp.camera.areffects.CameraArEffectsViewModel$1$2
            r0.<init>(r7, r3)
            X.C88604aC.A04(r0, r5, r1)
            goto L_0x00c1
        L_0x00e4:
            X.0vl r2 = r7.A0B
            java.lang.Object r0 = r2.getValue()
            X.4Qt r0 = (X.C86214Qt) r0
            X.1G4 r1 = r0.A03
            com.whatsapp.camera.areffects.CameraArEffectsViewModel$2 r0 = new com.whatsapp.camera.areffects.CameraArEffectsViewModel$2
            r0.<init>(r7, r3)
            X.C88604aC.A04(r0, r5, r1)
            java.lang.Object r0 = r2.getValue()
            X.4Qt r0 = (X.C86214Qt) r0
            X.0vl r0 = r0.A02
            X.1Fz r1 = X.AnonymousClass3MX.A18(r0)
            com.whatsapp.camera.areffects.CameraArEffectsViewModel$3 r0 = new com.whatsapp.camera.areffects.CameraArEffectsViewModel$3
            r0.<init>(r7, r3)
            X.C88604aC.A04(r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75603ho.<init>(X.1pP, X.9Zt, com.whatsapp.areffects.util.ArEffectsGatingUtil, X.5Wi, X.7DY, X.118, X.0ve, X.00H, X.00H, X.00H, X.0wl, X.0wl):void");
    }

    public void A0f(AnonymousClass4DE r4, AnonymousClass4DE r5) {
        C18070vi.A0d(r5, 1);
        super.A0f(r4, r5);
        if (r4 != null) {
            int ordinal = r5.ordinal();
            int i = 70;
            if (ordinal != 2) {
                i = 71;
                if (ordinal != 3) {
                    if (ordinal == 6) {
                        i = 72;
                    } else {
                        return;
                    }
                }
            }
            int intValue = Integer.valueOf(i).intValue();
            AnonymousClass7DY r0 = this.A07;
            C72463Mc.A1F(r0.A1L, intValue, AnonymousClass7DY.A01(r0));
        }
    }

    public static final LayerDrawable A08(C75603ho r9, boolean z) {
        Context context = r9.A0H.A00;
        Resources resources = context.getResources();
        int i = 2131168728;
        if (z) {
            i = 2131168731;
        }
        int dimensionPixelSize = resources.getDimensionPixelSize(i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1);
        gradientDrawable.setSize(dimensionPixelSize, dimensionPixelSize);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(2131165341);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setColor(0);
        gradientDrawable2.setSize(dimensionPixelSize2, dimensionPixelSize2);
        Resources resources2 = context.getResources();
        int i2 = 2131168727;
        if (z) {
            i2 = 2131168730;
        }
        int dimensionPixelSize3 = resources2.getDimensionPixelSize(i2);
        LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable2, gradientDrawable});
        layerDrawable.setLayerInset(1, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize3);
        return layerDrawable;
    }

    public final AnonymousClass77X A0l() {
        Collection A0g = C17890vO.A0g(this.A0G);
        ArrayList A0E2 = C29351c6.A0E(A0g);
        Iterator it = A0g.iterator();
        while (it.hasNext()) {
            A0E2.add(ArEffectSession.A03(it));
        }
        ArrayList<C92584hZ> A13 = AnonymousClass000.A13();
        for (Object next : A0E2) {
            if (next instanceof C92584hZ) {
                A13.add(next);
            }
        }
        ArrayList A0E3 = C29351c6.A0E(A13);
        for (C92584hZ r0 : A13) {
            A0E3.add(r0.A01);
        }
        Set A12 = C29431cG.A12(A0E3);
        return new AnonymousClass77X(A12.contains(AnonymousClass4DE.FUN_EFFECT), A12.contains(AnonymousClass4DE.BACKGROUND), A12.contains(AnonymousClass4DE.FILTER), A12.contains(AnonymousClass4DE.LOW_LIGHT), A12.contains(AnonymousClass4DE.TOUCH_UP));
    }

    public final boolean A0m() {
        Collection A0g = C17890vO.A0g(this.A0G);
        if (A0g == null || !A0g.isEmpty()) {
            Iterator it = A0g.iterator();
            while (it.hasNext()) {
                if (ArEffectSession.A03(it) instanceof C108335bX) {
                    return true;
                }
            }
        }
        return false;
    }

    public void A0a() {
        super.A0a();
        AnonymousClass7DY r0 = this.A07;
        C72463Mc.A1F(r0.A1L, 75, AnonymousClass7DY.A01(r0));
    }
}
