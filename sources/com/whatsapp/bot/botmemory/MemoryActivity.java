package com.whatsapp.bot.botmemory;

import X.AFB;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1G4;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3NL;
import X.AnonymousClass6VM;
import X.AnonymousClass79Z;
import X.AnonymousClass7S0;
import X.AnonymousClass7SB;
import X.C003401n;
import X.C108955ca;
import X.C108965cb;
import X.C109005cf;
import X.C110885hR;
import X.C111775kP;
import X.C115745vg;
import X.C115755vh;
import X.C115765vi;
import X.C115775vj;
import X.C123056Sy;
import X.C137526vb;
import X.C139776zQ;
import X.C1411974r;
import X.C1412674y;
import X.C148357hJ;
import X.C148367hK;
import X.C155117sE;
import X.C17880vN;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C27871Xy;
import X.C30391dr;
import X.C36401np;
import X.C36531o3;
import X.C73193Ri;
import X.C91314fU;
import X.C99274sY;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.topbar.WDSToolbar;

public final class MemoryActivity extends AnonymousClass1FY {
    public ScrollView A00;
    public Group A01;
    public C111775kP A02;
    public C36531o3 A03;
    public C36401np A04;
    public WDSToolbar A05;
    public TextEmojiLabel A06;
    public boolean A07;
    public final C18100vl A08;

    private final void A03(TextEmojiLabel textEmojiLabel, String str) {
        String str2;
        C36531o3 r1 = this.A03;
        if (r1 != null) {
            String A002 = r1.A00("452845737176270");
            C36401np r4 = this.A04;
            if (r4 != null) {
                textEmojiLabel.setText(r4.A04(this, str, (Runnable[]) null, new String[]{"learn-more"}, new String[]{A002}));
                return;
            }
            str2 = "linkifier";
        } else {
            str2 = "contextualHelpHandler";
        }
        C18070vi.A11(str2);
        throw null;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        getMenuInflater().inflate(2131820570, menu);
        C137526vb.A01(menu, true);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A012 = AnonymousClass3MY.A01(menuItem, 0);
        if (A012 == 2131432255) {
            AnonymousClass1G4 r3 = C108965cb.A0J(this).A03;
            do {
            } while (!r3.BFK(r3.getValue(), C115775vj.A00));
            return true;
        } else if (A012 == 2131429869) {
            C123056Sy r1 = (C123056Sy) C108965cb.A0J(this).A04.getValue();
            if (r1 instanceof C115765vi) {
                A0Q(this, (C18090vk) null, true);
                return true;
            } else if (!(r1 instanceof C115755vh)) {
                return false;
            } else {
                A0Q(this, new AnonymousClass7S0(((C115755vh) r1).A00, this, 0), false);
                return true;
            }
        } else if (A012 != 2131429072) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            C108965cb.A0J(this).A0T();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean z;
        MenuItem findItem;
        int i;
        C18070vi.A0d(menu, 0);
        C123056Sy r1 = (C123056Sy) C108965cb.A0J(this).A04.getValue();
        if (r1 instanceof C115775vj) {
            menu.findItem(2131432255).setVisible(false);
            menu.findItem(2131429869).setVisible(false);
            MenuItem findItem2 = menu.findItem(2131429072);
            findItem2.setVisible(true);
            findItem2.setShowAsAction(2);
        } else {
            if (r1 instanceof C115755vh) {
                menu.findItem(2131432255).setVisible(false);
                findItem = menu.findItem(2131429869);
                findItem.setVisible(true);
                findItem.setShowAsAction(2);
                i = 2131891975;
            } else {
                if (r1 instanceof C115765vi) {
                    z = ((C115765vi) r1).A01.isEmpty();
                } else {
                    z = r1 instanceof C115745vg;
                }
                MenuItem findItem3 = menu.findItem(2131432255);
                if (z) {
                    findItem3.setVisible(false);
                    menu.findItem(2131429869).setVisible(false);
                    menu.findItem(2131429072).setVisible(false);
                } else {
                    findItem3.setVisible(true);
                    findItem3.setShowAsAction(0);
                    findItem = menu.findItem(2131429869);
                    findItem.setVisible(true);
                    findItem.setShowAsAction(0);
                    i = 2131899174;
                }
            }
            findItem.setTitle(i);
            menu.findItem(2131429072).setVisible(false);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A03 = AnonymousClass3Ma.A0T(A0A);
            this.A04 = AnonymousClass3MY.A0e(r1);
        }
    }

    public MemoryActivity(int i) {
        this.A07 = false;
        AnonymousClass79Z.A00(this, 20);
    }

    public static final void A0Q(MemoryActivity memoryActivity, C18090vk r5, boolean z) {
        C73193Ri A002 = C73193Ri.A00(memoryActivity);
        int i = 2131891976;
        if (z) {
            i = 2131891977;
        }
        A002.A0V(i);
        A002.A0U(2131891973);
        A002.A0W(new C1411974r(1), 2131891974);
        int i2 = 2131891975;
        if (z) {
            i2 = 2131899174;
        }
        A002.A0X(new C1412674y(memoryActivity, r5, 0, z), i2);
        AnonymousClass3MY.A1G(A002);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131624072);
        WDSToolbar wDSToolbar = (WDSToolbar) C110885hR.A0A(this, 2131436268);
        wDSToolbar.setDividerVisibility(C27871Xy.GONE);
        AnonymousClass3NL.A02(this, wDSToolbar, this.A00, 2131231675);
        wDSToolbar.setBackgroundResource(C108955ca.A02(this));
        setSupportActionBar(wDSToolbar);
        wDSToolbar.setNavigationOnClickListener(new AFB(this, 35));
        this.A05 = wDSToolbar;
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            supportActionBar.A0M(2131899173);
            getWindow().setNavigationBarColor(0);
            getWindow().setStatusBarColor(0);
            AnonymousClass6VM.A00(getWindow(), false);
            AnonymousClass1HF.A0g(findViewById(2131434744), new C91314fU(1));
            TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C110885hR.A0A(this, 2131432084);
            this.A06 = textEmojiLabel;
            if (textEmojiLabel == null) {
                C18070vi.A11("header");
                throw null;
            }
            A03(textEmojiLabel, C18070vi.A0F(this, 2131892191));
            A03((TextEmojiLabel) AnonymousClass3MY.A0C(this, 2131430383), C18070vi.A0F(this, 2131892189));
            this.A01 = (Group) C110885hR.A0A(this, 2131433178);
            this.A00 = (ScrollView) C110885hR.A0A(this, 2131430380);
            this.A02 = new C111775kP(AnonymousClass7SB.A00(this, 0), AnonymousClass7SB.A00(this, 1));
            RecyclerView recyclerView = (RecyclerView) C110885hR.A0A(this, 2131434428);
            recyclerView.setAdapter(this.A02);
            AnonymousClass3Ma.A15(this, recyclerView);
            AnonymousClass3MX.A1Q(new MemoryActivity$onCreate$6(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
            if (getIntent().hasExtra("extra_entry_point")) {
                int intExtra = getIntent().getIntExtra("extra_entry_point", 22);
                MemoryViewModel A0J = C108965cb.A0J(this);
                Integer valueOf = Integer.valueOf(intExtra);
                A0J.A00 = valueOf;
                if (valueOf != null) {
                    ((C139776zQ) A0J.A01.get()).A02(intExtra);
                    return;
                }
                return;
            }
            return;
        }
        throw C17880vN.A0g();
    }

    public MemoryActivity() {
        this(0);
        this.A08 = C99274sY.A00(new C148367hK(this), new C148357hJ(this), new C155117sE(this), AnonymousClass3MW.A15(MemoryViewModel.class));
    }
}
