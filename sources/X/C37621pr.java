package X;

import android.content.res.Configuration;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.conversationslist.ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.1pr  reason: invalid class name and case insensitive filesystem */
public abstract class C37621pr {
    public C49242Ps A00;
    public boolean A01;
    public boolean A02;
    public final C37551pj A03;
    public final AnonymousClass1M9 A04;
    public final C24791Lr A05;
    public final ConversationsFragment A06;
    public final AnonymousClass18K A07;
    public final C37611pq A08;
    public final C200710s A09;

    public void A01() {
        AnonymousClass1M9 r6;
        C37551pj r5;
        C24791Lr r7;
        int i;
        boolean z;
        boolean z2;
        int i2;
        Integer num;
        Integer num2;
        if (this instanceof C37641pt) {
            C37641pt r8 = (C37641pt) this;
            if (r8.A02 || (num = r8.A01) == (num2 = AnonymousClass00R.A01)) {
                r8.A03(true);
                return;
            }
            Integer num3 = AnonymousClass00R.A00;
            if (num == num3 || num == AnonymousClass00R.A0C) {
                r8.A01 = num2;
                r8.A03(true);
                C23651Hc r1 = r8.A04;
                if (r1.A07) {
                    C30451dy.A02(num3, r8.A0B, new ActionableContactsWithPresenceAndProfilePicNuxHelper$loadSuggestions$1(r8, (C30391dr) null), r8.A0C);
                    return;
                }
                C37651pu r0 = r8.A00;
                r1.unregisterObserver(r0);
                r1.registerObserver(r0);
            }
        } else if (this.A02) {
            boolean z3 = this instanceof AnonymousClass2DK;
            if (z3) {
                AnonymousClass2DK r3 = (AnonymousClass2DK) this;
                ConversationsFragment conversationsFragment = r3.A06;
                TextView textView = (TextView) conversationsFragment.A17().findViewById(2131429627).findViewById(2131430397);
                if (!r3.A03.A00() || !r3.A04) {
                    i2 = 8;
                } else {
                    C18070vi.A0b(textView);
                    String A1H = conversationsFragment.A1H(2131889753);
                    textView.setText(C72813Np.A02(textView.getPaint(), AnonymousClass4aX.A02(conversationsFragment.A14(), 2131233236, 2131101222), A1H, "%s"));
                    i2 = 0;
                }
                textView.setVisibility(i2);
            } else {
                C37631ps r4 = (C37631ps) this;
                HorizontalScrollView horizontalScrollView = r4.A01;
                if (horizontalScrollView != null && C18000vb.A00(r4.A0B).A06) {
                    horizontalScrollView.postDelayed(new C98554rL(horizontalScrollView, 19), 300);
                }
                ImageButton imageButton = r4.A02;
                if (imageButton != null && C18000vb.A00(r4.A0B).A06) {
                    imageButton.setRotationY(180.0f);
                }
            }
            A00();
            C200710s r32 = this.A09;
            r32.A03();
            if (z3) {
                i = 5;
                r6 = this.A04;
                r5 = this.A03;
                r7 = this.A05;
                z = true;
                z2 = false;
            } else {
                r6 = this.A04;
                r5 = this.A03;
                r7 = this.A05;
                i = 15;
                z = false;
                z2 = true;
            }
            C49242Ps r42 = new C49242Ps(r5, r6, r7, this, i, z, z2);
            this.A00 = r42;
            A03(true);
            r42.A02.executeOnExecutor(r32, new Object[0]);
            this.A02 = false;
        }
    }

    public void A00() {
        C49242Ps r1 = this.A00;
        if (r1 != null) {
            r1.A0B(true);
        }
        A03(false);
        this.A02 = false;
    }

    public void A02(ViewGroup viewGroup, boolean z) {
        if (this instanceof C37631ps) {
            C37631ps r3 = (C37631ps) this;
            C18070vi.A0d(viewGroup, 0);
            r3.A00 = viewGroup;
            r3.A07 = (TextView) viewGroup.findViewById(2131436208);
            r3.A06 = (TextView) viewGroup.findViewById(2131434207);
            r3.A04 = (LinearLayout) viewGroup.findViewById(2131429488);
            r3.A01 = (HorizontalScrollView) viewGroup.findViewById(2131429495);
            r3.A03 = (ImageView) viewGroup.findViewById(2131430377);
            C61822qK r1 = C61822qK.A00;
            Configuration configuration = viewGroup.getResources().getConfiguration();
            C18070vi.A0X(configuration);
            r1.A00(configuration, viewGroup, z);
            TextView textView = r3.A06;
            if (textView != null) {
                textView.setOnClickListener(new C89924dF(r3, 6));
            }
            viewGroup.findViewById(2131436208).setOnClickListener(new C89924dF(r3, 7));
            r3.A08 = new C28931bI(viewGroup.findViewById(2131430386));
            r3.A05 = (RelativeLayout) viewGroup.findViewById(2131430385);
            r3.A09 = new C28931bI(viewGroup.findViewById(2131431797));
        }
    }

    public void A03(boolean z) {
        if (this instanceof C37631ps) {
            C37631ps r3 = (C37631ps) this;
            C28931bI r2 = r3.A08;
            int i = 0;
            if (r2 != null) {
                int i2 = 8;
                if (z) {
                    i2 = 0;
                }
                r2.A04(i2);
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) r2.A02();
                if (z) {
                    shimmerFrameLayout.A03();
                } else {
                    shimmerFrameLayout.A04();
                }
            }
            RelativeLayout relativeLayout = r3.A05;
            if (relativeLayout != null) {
                if (z) {
                    i = 8;
                }
                relativeLayout.setVisibility(i);
            }
        }
    }

    public C37621pr(C37551pj r3, AnonymousClass1M9 r4, C24791Lr r5, ConversationsFragment conversationsFragment, AnonymousClass18K r7, C37611pq r8, AnonymousClass10I r9) {
        this.A07 = r7;
        this.A04 = r4;
        this.A03 = r3;
        this.A05 = r5;
        this.A06 = conversationsFragment;
        this.A08 = r8;
        this.A09 = new C200710s(r9, false);
    }
}
