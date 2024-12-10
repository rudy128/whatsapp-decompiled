package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.3ZY  reason: invalid class name */
public abstract class AnonymousClass3ZY extends C42011xT {
    public final ParticipantsListViewModel A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3ZY(View view, ParticipantsListViewModel participantsListViewModel) {
        super(view);
        C18070vi.A0d(view, 1);
        this.A00 = participantsListViewModel;
    }

    public void A0B(C86594Sg r13) {
        String string;
        String string2;
        if (this instanceof C76153mg) {
            C76153mg r2 = (C76153mg) this;
            if (!r2.A01) {
                AnonymousClass4aR.A06(r2.A0H.getContext(), r2.A00);
            }
            WaImageView waImageView = r2.A00;
            AnonymousClass3MY.A14(AnonymousClass000.A0Y(waImageView), waImageView, 2131165510);
        } else if (this instanceof C76123md) {
            C76123md r3 = (C76123md) this;
            C18070vi.A0d(r13, 0);
            if (!(r13 instanceof C76553nX)) {
                C17960vV.A0F(false, "Unknown list item type");
                return;
            }
            AnonymousClass4ZN.A02(r3.A0H, r3.A00, ((C76553nX) r13).A00);
        } else if (this instanceof C76143mf) {
            C76143mf r4 = (C76143mf) this;
            C18070vi.A0d(r13, 0);
            if (!(r13 instanceof C76563nY)) {
                C17960vV.A0F(false, "Unknown list item type");
                return;
            }
            C76563nY r132 = (C76563nY) r13;
            ((TextView) r4.A01.getValue()).setText(r132.A00);
            View A0A = AnonymousClass3MW.A0A(r4.A00);
            if (r132.A01) {
                A0A.setOnClickListener(new C89994dM(r4, A0A, 38));
                A0A.setVisibility(0);
                return;
            }
            A0A.setOnClickListener((View.OnClickListener) null);
            A0A.setVisibility(8);
        } else if (this instanceof C76103mb) {
            C76103mb r42 = (C76103mb) this;
            C18070vi.A0d(r13, 0);
            if (r13 instanceof C76573nZ) {
                View view = r42.A0H;
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131165627);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.leftMargin = dimensionPixelSize;
                    marginLayoutParams.rightMargin = dimensionPixelSize;
                    view.setLayoutParams(marginLayoutParams);
                    C106735Wz r32 = ((C76573nZ) r13).A00;
                    view.setVisibility(0);
                    C93424ix r33 = (C93424ix) r32;
                    C76103mb.A00(r33.A00, (WDSButton) AnonymousClass3MX.A0C(view, 2131430878), new AnonymousClass5DE(r42));
                    C76103mb.A00(r33.A01, (WDSButton) AnonymousClass3MX.A0C(view, 2131434991), new AnonymousClass5DF(r42));
                    return;
                }
                throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        } else if (this instanceof C76163mh) {
            C76163mh r34 = (C76163mh) this;
            boolean z = r13 instanceof C76543nW;
            C17960vV.A0F(z, "unknown view state type");
            ParticipantsListViewModel participantsListViewModel = r34.A00;
            C17960vV.A0F(AnonymousClass000.A1W(participantsListViewModel), "view model is null");
            if (z && participantsListViewModel != null) {
                WaTextView waTextView = r34.A01;
                AnonymousClass4ZN r1 = ((C76543nW) r13).A00;
                View view2 = r34.A0H;
                AnonymousClass4ZN.A01(view2.getContext(), waTextView, r1);
                Resources resources = view2.getResources();
                boolean A1O = C72463Mc.A1O(participantsListViewModel.A0F);
                C175258yP r10 = participantsListViewModel.A06;
                AnonymousClass1EC r9 = r10.A07().A08;
                AnonymousClass1M9 r6 = r34.A02;
                C24921Me r22 = r34.A03;
                AnonymousClass1E7 A01 = C63982u1.A01(r6, r34.A04, r9, r34.A05, A1O);
                if (A01 == null || (string = AnonymousClass3MY.A0q(r22, A01)) == null) {
                    string = resources.getString(2131890896);
                    int i = 2131887619;
                    if (r10.A07().A0Q) {
                        i = 2131887618;
                    }
                    string2 = resources.getString(i);
                } else {
                    int i2 = 2131898052;
                    if (r10.A07().A0Q) {
                        i2 = 2131897847;
                    }
                    string2 = AnonymousClass3MW.A0x(resources, string, new Object[1], 0, i2);
                }
                TextEmojiLabel textEmojiLabel = r34.A00;
                textEmojiLabel.setText(string);
                textEmojiLabel.setContentDescription(string2);
                view2.post(new C146427Pb(r34, 18));
            }
        } else if (this instanceof C76113mc) {
            C76113mc r35 = (C76113mc) this;
            int i3 = r13.A00;
            if (i3 != 2) {
                C17900vP.A0k("CallInfoButtonViewHolder/bind/Unsupported item type: ", AnonymousClass000.A10(), i3);
                return;
            }
            View view3 = r35.A0H;
            view3.setClickable(true);
            view3.setOnClickListener(new AnonymousClass781(1));
            r35.A00.setText(2131898177);
        } else {
            C76133me r43 = (C76133me) this;
            View view4 = r43.A0H;
            view4.setClickable(true);
            C89874dA.A00(view4, r43, 43);
            Context context = view4.getContext();
            if (!r43.A01) {
                AnonymousClass4aR.A06(context, r43.A00);
            }
            AnonymousClass4aR.A07(view4, context.getString(2131898165), context.getString(2131898164));
            r43.A00.setImageResource(2131232176);
        }
    }
}
