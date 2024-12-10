package X;

import android.content.ContentProvider;
import android.content.Context;
import android.net.Uri;
import com.whatsapp.accountswitching.AccountSwitchingContentProvider;
import com.whatsapp.contentprovider.MediaProvider;
import com.whatsapp.instrumentation.api.InstrumentationProvider;
import com.whatsapp.registration.directmigration.MigrationContentProvider;
import com.whatsapp.stickers.storage.WhitelistPackQueryContentProvider;
import com.whatsapp.util.Log;

/* renamed from: X.0yj  reason: invalid class name and case insensitive filesystem */
public abstract class C19680yj extends ContentProvider {
    public boolean A00;

    public final synchronized void A09() {
        if (!this.A00) {
            StringBuilder sb = new StringBuilder();
            sb.append("WaBaseContentProvider/ensureInitialized called for ");
            String simpleName = getClass().getSimpleName();
            C18070vi.A0X(simpleName);
            sb.append(simpleName);
            Log.i(sb.toString());
            Boolean bool = C17970vW.A03;
            if (!C22781De.A03()) {
                C17960vV.A01();
                C17960vV.A00.block();
            }
            A08();
            this.A00 = true;
        }
    }

    public static Uri.Builder A00() {
        return new Uri.Builder().scheme("content").authority(MediaProvider.A0B);
    }

    public void A08() {
        if (this instanceof WhitelistPackQueryContentProvider) {
            WhitelistPackQueryContentProvider whitelistPackQueryContentProvider = (WhitelistPackQueryContentProvider) this;
            whitelistPackQueryContentProvider.A01 = (AnonymousClass702) ((AnonymousClass10E) ((C000100c) AnonymousClass00E.A00(whitelistPackQueryContentProvider.getContext().getApplicationContext(), C000100c.class))).AAu.get();
        } else if (this instanceof MigrationContentProvider) {
            MigrationContentProvider migrationContentProvider = (MigrationContentProvider) this;
            C000100c r3 = (C000100c) AnonymousClass00E.A00(migrationContentProvider.getContext(), C000100c.class);
            migrationContentProvider.A02 = r3.BA6();
            AnonymousClass10E r2 = (AnonymousClass10E) r3;
            migrationContentProvider.A01 = (C218617r) r2.A8v.get();
            migrationContentProvider.A03 = (AnonymousClass18O) r2.A9p.get();
            migrationContentProvider.A0A = (AnonymousClass1L7) r2.A3t.get();
            migrationContentProvider.A06 = (C33621j7) r2.A0g.get();
            migrationContentProvider.A09 = (C46152Dc) r2.A23.get();
            migrationContentProvider.A08 = (AnonymousClass1NT) r2.A3f.get();
            migrationContentProvider.A0G = (AnonymousClass4aW) r2.Ao8.A00.A5C.get();
            migrationContentProvider.A0F = (AnonymousClass1Nb) r2.A2E.get();
            migrationContentProvider.A0C = r3.CRw();
            migrationContentProvider.A05 = (AnonymousClass1NP) r2.A0j.get();
            migrationContentProvider.A0B = (C219217x) r2.ABj.get();
            migrationContentProvider.A07 = (AnonymousClass1NO) r2.A3e.get();
            migrationContentProvider.A0H = (C170178or) r2.AAM.get();
            migrationContentProvider.A0D = (AnonymousClass11O) r2.ABn.get();
            migrationContentProvider.A00 = (AnonymousClass190) r2.A31.get();
            migrationContentProvider.A0E = r3.BAL();
            migrationContentProvider.A04 = (C29491cN) r2.A08.get();
        } else if (this instanceof InstrumentationProvider) {
            InstrumentationProvider instrumentationProvider = (InstrumentationProvider) this;
            Context context = instrumentationProvider.getContext();
            if (context != null) {
                C000100c r22 = (C000100c) AnonymousClass00E.A00(context, C000100c.class);
                AnonymousClass10E r1 = (AnonymousClass10E) r22;
                instrumentationProvider.A02 = (AnonymousClass1HY) r1.A5M.get();
                instrumentationProvider.A00 = (AnonymousClass1TM) r1.A5K.get();
                instrumentationProvider.A03 = (C37011op) r1.A5N.get();
                instrumentationProvider.A04 = r22.CEB();
                instrumentationProvider.A01 = (C53492cc) r1.Ao8.A00.A14.get();
                return;
            }
            throw new IllegalStateException("Context is not attached.");
        } else if (this instanceof MediaProvider) {
            MediaProvider mediaProvider = (MediaProvider) this;
            Context context2 = mediaProvider.getContext();
            if (context2 != null) {
                mediaProvider.A00 = context2;
                C000100c r23 = (C000100c) AnonymousClass00E.A00(context2, C000100c.class);
                mediaProvider.A05 = r23.CP7();
                AnonymousClass10E r24 = (AnonymousClass10E) r23;
                mediaProvider.A01 = (C218617r) r24.A8v.get();
                mediaProvider.A02 = (AnonymousClass1M9) r24.A2f.get();
                mediaProvider.A03 = (C24921Me) r24.ABX.get();
                mediaProvider.A08 = (AnonymousClass1W6) r24.A3w.get();
                mediaProvider.A06 = (AnonymousClass1ST) r24.A6C.get();
                mediaProvider.A07 = (C32211gp) r24.A9r.get();
                mediaProvider.A04 = (C25161Nd) r24.A2v.get();
                mediaProvider.A09 = (AnonymousClass1NL) r24.A3u.get();
                return;
            }
            throw new IllegalStateException("Cannot find context from the provider.");
        } else {
            AccountSwitchingContentProvider accountSwitchingContentProvider = (AccountSwitchingContentProvider) this;
            Context context3 = accountSwitchingContentProvider.getContext();
            if (context3 != null) {
                C000100c r12 = (C000100c) AnonymousClass00E.A00(context3, C000100c.class);
                AnonymousClass11P CP7 = r12.CP7();
                C18070vi.A0d(CP7, 0);
                accountSwitchingContentProvider.A01 = CP7;
                C18030ve BAL = r12.BAL();
                C18070vi.A0d(BAL, 0);
                accountSwitchingContentProvider.A05 = BAL;
                AnonymousClass10I CRy = r12.CRy();
                C18070vi.A0d(CRy, 0);
                accountSwitchingContentProvider.A0C = CRy;
                AnonymousClass10E r4 = (AnonymousClass10E) r12;
                C25011Mn r0 = (C25011Mn) r4.A9o.get();
                C18070vi.A0d(r0, 0);
                accountSwitchingContentProvider.A09 = r0;
                AnonymousClass11Z COg = r12.COg();
                C18070vi.A0d(COg, 0);
                accountSwitchingContentProvider.A03 = COg;
                AnonymousClass00H A002 = C000200d.A00(r4.A94);
                C18070vi.A0d(A002, 0);
                accountSwitchingContentProvider.A0R = A002;
                AnonymousClass00H A003 = C000200d.A00(r4.ABf);
                C18070vi.A0d(A003, 0);
                accountSwitchingContentProvider.A0U = A003;
                AnonymousClass00H A004 = C000200d.A00(r4.AAe);
                C18070vi.A0d(A004, 0);
                accountSwitchingContentProvider.A0T = A004;
                AnonymousClass00H A005 = C000200d.A00(r4.A65);
                C18070vi.A0d(A005, 0);
                accountSwitchingContentProvider.A0Q = A005;
                AnonymousClass00H A006 = C000200d.A00(r4.A0a);
                C18070vi.A0d(A006, 0);
                accountSwitchingContentProvider.A0K = A006;
                AnonymousClass00H A007 = C000200d.A00(r4.A08);
                C18070vi.A0d(A007, 0);
                accountSwitchingContentProvider.A0E = A007;
                AnonymousClass00H A008 = C000200d.A00(r4.A5o);
                C18070vi.A0d(A008, 0);
                accountSwitchingContentProvider.A0P = A008;
                AnonymousClass00H A009 = C000200d.A00(r4.AAU);
                C18070vi.A0d(A009, 0);
                accountSwitchingContentProvider.A0S = A009;
                C24811Lt r02 = (C24811Lt) r4.ABb.get();
                C18070vi.A0d(r02, 0);
                accountSwitchingContentProvider.A0D = r02;
                C23651Hc r03 = (C23651Hc) r4.ACD.get();
                C18070vi.A0d(r03, 0);
                accountSwitchingContentProvider.A00 = r03;
                AnonymousClass00H A0010 = C000200d.A00(r4.A2K);
                C18070vi.A0d(A0010, 0);
                accountSwitchingContentProvider.A0M = A0010;
                AnonymousClass11A r04 = (AnonymousClass11A) r4.A62.get();
                C18070vi.A0d(r04, 0);
                accountSwitchingContentProvider.A0B = r04;
                AnonymousClass00H A0011 = C000200d.A00(r4.A2E);
                C18070vi.A0d(A0011, 0);
                accountSwitchingContentProvider.A0L = A0011;
                AnonymousClass00H A0012 = C000200d.A00(r4.A0O);
                C18070vi.A0d(A0012, 0);
                accountSwitchingContentProvider.A0J = A0012;
                AnonymousClass1Cd Bjr = r12.Bjr();
                C18070vi.A0d(Bjr, 0);
                accountSwitchingContentProvider.A04 = Bjr;
                C19830z4 CRw = r12.CRw();
                C18070vi.A0d(CRw, 0);
                accountSwitchingContentProvider.A02 = CRw;
                C219017v r05 = (C219017v) r4.A91.get();
                C18070vi.A0d(r05, 0);
                accountSwitchingContentProvider.A08 = r05;
                AnonymousClass00H A0013 = C000200d.A00(r4.A0D);
                C18070vi.A0d(A0013, 0);
                accountSwitchingContentProvider.A0I = A0013;
                AnonymousClass00H A0014 = C000200d.A00(r4.A09);
                C18070vi.A0d(A0014, 0);
                accountSwitchingContentProvider.A0F = A0014;
                C17930vS BIa = r12.BIa();
                C18070vi.A0d(BIa, 0);
                accountSwitchingContentProvider.A06 = BIa;
                AnonymousClass00H A0015 = C000200d.A00(r4.A0A);
                C18070vi.A0d(A0015, 0);
                accountSwitchingContentProvider.A0G = A0015;
                AnonymousClass10G r13 = r4.Ao8.A00;
                AnonymousClass00H A0016 = C000200d.A00(r13.A2h);
                C18070vi.A0d(A0016, 0);
                accountSwitchingContentProvider.A0N = A0016;
                AnonymousClass10X r06 = (AnonymousClass10X) r4.A5g.get();
                C18070vi.A0d(r06, 0);
                accountSwitchingContentProvider.A0A = r06;
                C199210d r07 = (C199210d) r4.A6w.get();
                C18070vi.A0d(r07, 0);
                accountSwitchingContentProvider.A07 = r07;
                AnonymousClass00H A0017 = C000200d.A00(r4.A0C);
                C18070vi.A0d(A0017, 0);
                accountSwitchingContentProvider.A0H = A0017;
                AnonymousClass00H A0018 = C000200d.A00(r13.A2g);
                C18070vi.A0d(A0018, 0);
                accountSwitchingContentProvider.A0O = A0018;
                return;
            }
            throw new IllegalStateException("Context is not attached.");
        }
    }

    public boolean onCreate() {
        C18070vi.A0X(getClass().getSimpleName());
        return true;
    }
}
