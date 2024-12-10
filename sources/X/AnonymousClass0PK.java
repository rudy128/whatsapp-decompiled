package X;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.0PK  reason: invalid class name */
public abstract class AnonymousClass0PK {
    public static final AnonymousClass07W A00 = AnonymousClass0PZ.A00(AnonymousClass0Q9.A06(), C09090g9.A00);
    public static final AnonymousClass07W A01 = AnonymousClass0PZ.A02(C09100gA.A00);
    public static final AnonymousClass07W A02 = AnonymousClass0PZ.A02(C09110gB.A00);
    public static final AnonymousClass07W A03 = AnonymousClass0PZ.A02(C09120gC.A00);
    public static final AnonymousClass07W A04 = AnonymousClass0PZ.A02(C09140gE.A00);
    public static final AnonymousClass07W A05 = AnonymousClass0PZ.A02(C09130gD.A00);

    public static final AnonymousClass0HG A00(Context context, Configuration configuration, C17130tn r8) {
        r8.COB(-485908294);
        Object A0u = AnonymousClass000.A0u(r8, -492369756);
        Object obj = AnonymousClass0MH.A00;
        if (A0u == obj) {
            A0u = new AnonymousClass0HG();
            AnonymousClass0VR.A0V(r8, A0u);
        }
        AnonymousClass0VR r3 = (AnonymousClass0VR) r8;
        AnonymousClass0VR.A0R(r3, false);
        AnonymousClass0HG r5 = (AnonymousClass0HG) A0u;
        Object A0u2 = AnonymousClass000.A0u(r8, -492369756);
        Configuration configuration2 = A0u2;
        if (A0u2 == obj) {
            Configuration configuration3 = new Configuration();
            if (configuration != null) {
                configuration3.setTo(configuration);
            }
            r8.CRH(configuration3);
            configuration2 = configuration3;
        }
        AnonymousClass0VR.A0R(r3, false);
        Configuration configuration4 = (Configuration) configuration2;
        Object A0u3 = AnonymousClass000.A0u(r8, -492369756);
        if (A0u3 == obj) {
            A0u3 = new AnonymousClass0R0(configuration4, r5);
            r3.A0c(A0u3);
        }
        AnonymousClass0VR.A0R(r3, false);
        AnonymousClass0QC.A03(r8, r5, new C10350iC(context, (AnonymousClass0R0) A0u3));
        AnonymousClass0VR.A0R(r3, false);
        return r5;
    }

    public static final void A01(C17130tn r12, AndroidComposeView androidComposeView, AnonymousClass1OS r14, int i) {
        r12.COC(1396852028);
        Context context = androidComposeView.getContext();
        Object A0u = AnonymousClass000.A0u(r12, -492369756);
        Object obj = AnonymousClass0MH.A00;
        if (A0u == obj) {
            A0u = AnonymousClass0Q9.A02(new Configuration(context.getResources().getConfiguration()));
            AnonymousClass0VR.A0V(r12, A0u);
        }
        AnonymousClass0VR r2 = (AnonymousClass0VR) r12;
        AnonymousClass0VR.A0R(r2, false);
        C17330uU r10 = (C17330uU) A0u;
        boolean A1V = AnonymousClass000.A1V(r12, r10, -230243351);
        Object CER = r12.CER();
        if (A1V || CER == obj) {
            CER = new C10060hj(r10);
            r2.A0c(CER);
        }
        AnonymousClass0VR.A0R(r2, false);
        androidComposeView.setConfigurationChangeObserver((C22821Di) CER);
        Object A0u2 = AnonymousClass000.A0u(r12, -492369756);
        if (A0u2 == obj) {
            A0u2 = new C06220Xl(context);
            r2.A0c(A0u2);
        }
        AnonymousClass0VR.A0R(r2, false);
        C06220Xl r4 = (C06220Xl) A0u2;
        AnonymousClass0Ii viewTreeOwners = androidComposeView.getViewTreeOwners();
        if (viewTreeOwners != null) {
            Object A0u3 = AnonymousClass000.A0u(r12, -492369756);
            if (A0u3 == obj) {
                A0u3 = C04860Pf.A00(androidComposeView, viewTreeOwners.A01());
                r12.CRH(A0u3);
            }
            AnonymousClass0VR.A0R(r2, false);
            AnonymousClass0W1 r6 = (AnonymousClass0W1) A0u3;
            AnonymousClass0QC.A03(r12, C27621Wu.A00, new C10070hk(r6));
            AnonymousClass0HG A002 = A00(context, (Configuration) r10.getValue(), r12);
            C03230Hd[] r22 = new C03230Hd[7];
            AnonymousClass07W.A00(A00, r10.getValue(), r22, 0);
            r22[1] = A01.A03(context);
            AnonymousClass07W.A00(A03, viewTreeOwners.A00(), r22, 2);
            r22[3] = A05.A03(viewTreeOwners.A01());
            r22[4] = C04100Lv.A00.A03(r6);
            r22[5] = A04.A03(androidComposeView);
            AnonymousClass07W.A00(A02, A002, r22, 6);
            AnonymousClass0PZ.A04(r12, AnonymousClass0LC.A00(r12, new C13330nE(androidComposeView, r4, r14), 1471621628), r22, 56);
            C05660Vf BKF = r12.BKF();
            if (BKF != null) {
                BKF.A03(new C13340nF(androidComposeView, r14, i));
                return;
            }
            return;
        }
        throw AnonymousClass000.A0n("Called when the ViewTreeOwnersAvailability is not yet in Available state");
    }

    public static final /* synthetic */ void A02(String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CompositionLocal ");
        A10.append(str);
        throw AnonymousClass000.A0o(" not present", A10);
    }
}
