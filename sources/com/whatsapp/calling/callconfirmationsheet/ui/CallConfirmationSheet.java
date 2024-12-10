package com.whatsapp.calling.callconfirmationsheet.ui;

import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3WH;
import X.AnonymousClass4ZN;
import X.AnonymousClass5C9;
import X.AnonymousClass5CA;
import X.AnonymousClass5CB;
import X.AnonymousClass5CC;
import X.AnonymousClass5X0;
import X.C105035Ql;
import X.C110745gz;
import X.C1422678u;
import X.C155277sU;
import X.C155287sV;
import X.C18000vb;
import X.C18070vi;
import X.C18100vl;
import X.C22339B3q;
import X.C27201Vd;
import X.C28931bI;
import X.C37451pZ;
import X.C38391rD;
import X.C72453Mb;
import X.C83604Fy;
import X.C83614Fz;
import X.C87154Um;
import X.C89874dA;
import X.C93464j1;
import X.C94214kE;
import X.C99274sY;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.calling.callconfirmationsheet.vm.CallConfirmationSheetViewModel;
import com.whatsapp.contact.photos.MultiContactThumbnail;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

public final class CallConfirmationSheet extends Hilt_CallConfirmationSheet {
    public WaImageView A00;
    public C37451pZ A01;
    public C37451pZ A02;
    public C18000vb A03;
    public C28931bI A04;
    public C28931bI A05;
    public AnonymousClass00H A06;
    public AnonymousClass00H A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public final C18100vl A0A = AnonymousClass1DF.A01(new AnonymousClass5C9(this));
    public final C18100vl A0B;

    public void A21(Bundle bundle, View view) {
        C28931bI r0;
        String str;
        RecyclerView recyclerView;
        C110745gz r2;
        View findViewById;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        WDSButton wDSButton = this.A06;
        if (wDSButton != null) {
            wDSButton.setText(2131887636);
        }
        WDSButton wDSButton2 = this.A06;
        if (wDSButton2 != null) {
            wDSButton2.setCompoundDrawablePadding(AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168777));
        }
        TextEmojiLabel textEmojiLabel = this.A02;
        if (textEmojiLabel != null) {
            textEmojiLabel.setMaxLines(1);
        }
        TextEmojiLabel textEmojiLabel2 = this.A02;
        if (textEmojiLabel2 != null) {
            textEmojiLabel2.setEllipsize(TextUtils.TruncateAt.END);
        }
        if (C72453Mb.A1a(AnonymousClass3Ma.A0P(this).A0D)) {
            View view2 = this.A00;
            if (view2 != null) {
                C89874dA.A00(view2, this, 9);
            }
            View view3 = this.A00;
            C28931bI r22 = null;
            WaImageView waImageView = null;
            if (view3 != null) {
                waImageView = AnonymousClass3MW.A0S(view3, 2131432786);
            }
            this.A00 = waImageView;
            View view4 = this.A00;
            if (view4 == null || (findViewById = view4.findViewById(2131431369)) == null) {
                r0 = null;
            } else {
                r0 = AnonymousClass3MW.A0p(findViewById);
            }
            this.A05 = r0;
            View findViewById2 = view.findViewById(2131430952);
            if (findViewById2 != null) {
                r22 = AnonymousClass3MW.A0p(findViewById2);
            }
            this.A04 = r22;
            AnonymousClass00H r02 = this.A08;
            if (r02 != null) {
                this.A01 = ((C27201Vd) r02.get()).A06(A14(), "lgc-call-confirmation-sheet");
                AnonymousClass00H r03 = this.A08;
                if (r03 != null) {
                    this.A02 = ((C27201Vd) r03.get()).A08("lgc-call-confirmation-sheet-multi", 0.0f, AnonymousClass3MZ.A09(this).getDimensionPixelSize(2131168778));
                    C28931bI r04 = this.A04;
                    if (r04 != null && (recyclerView = (RecyclerView) r04.A02()) != null) {
                        recyclerView.setPadding(0, 0, 0, 0);
                        Dialog dialog = this.A03;
                        if ((dialog instanceof C110745gz) && (r2 = (C110745gz) dialog) != null) {
                            recyclerView.setOnTouchListener(new C1422678u(r2, 3));
                        }
                        AnonymousClass00H r05 = this.A06;
                        if (r05 != null) {
                            Object obj = r05.get();
                            AnonymousClass3WH r1 = (AnonymousClass3WH) obj;
                            r1.A00 = AnonymousClass3MW.A0z(this.A01);
                            r1.A01 = new C105035Ql(this);
                            r1.A0K(true);
                            recyclerView.setAdapter((C38391rD) obj);
                            return;
                        }
                        str = "adapter";
                        C18070vi.A11(str);
                        throw null;
                    }
                    return;
                }
            }
            str = "contactPhotos";
            C18070vi.A11(str);
            throw null;
        }
    }

    public int A2K(int i, int i2) {
        if (i2 == 1 && C72453Mb.A1a(AnonymousClass3Ma.A0P(this).A0D)) {
            Resources A092 = AnonymousClass3MZ.A09(this);
            C18070vi.A0X(A092);
            if (i > C22339B3q.A00((((double) (700 * A092.getDisplayMetrics().densityDpi)) * 1.0d) / 160.0d)) {
                return (int) (((float) i) * 0.65f);
            }
        }
        return super.A2K(i, i2);
    }

    public void A2M(C87154Um r5) {
        View view;
        MultiContactThumbnail multiContactThumbnail;
        C28931bI r0;
        C18070vi.A0d(r5, 0);
        TextView textView = this.A01;
        if (textView != null) {
            AnonymousClass4ZN.A01(A14(), textView, r5.A03);
        }
        TextEmojiLabel textEmojiLabel = this.A02;
        if (textEmojiLabel != null) {
            AnonymousClass4ZN.A01(A14(), textEmojiLabel, r5.A02);
        }
        WDSButton wDSButton = this.A06;
        if (wDSButton != null) {
            A00(r5.A00, wDSButton);
        }
        AnonymousClass5X0 r1 = r5.A01;
        if ((r1 instanceof C93464j1) && (r0 = this.A05) != null) {
            A00((C93464j1) r1, (WDSButton) AnonymousClass3MX.A0D(r0));
        }
        C37451pZ r3 = this.A02;
        if (!(r3 == null || (view = this.A00) == null || (multiContactThumbnail = (MultiContactThumbnail) view.findViewById(2131433811)) == null)) {
            List list = r5.A04;
            C94214kE r02 = (C94214kE) this.A0A.getValue();
            r02.A00(list);
            multiContactThumbnail.A00(r02, r3, list);
        }
        super.A2L();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        CallConfirmationSheetViewModel A0P = AnonymousClass3Ma.A0P(this);
        if (!A0P.A00) {
            int i = A0P.A01;
            if (C83614Fz.A00(i)) {
                A0P.A05.BiX(15, CallConfirmationSheetViewModel.A03(A0P), 8, false);
            } else if (AnonymousClass3Ma.A1b(C83604Fy.A00(), i)) {
                A0P.A05.BiW(8, 15);
            }
        }
    }

    private final void A00(C93464j1 r4, WDSButton wDSButton) {
        CharSequence charSequence;
        C18000vb r0 = this.A03;
        if (r0 != null) {
            boolean A1b = AnonymousClass3MY.A1b(r0);
            int i = r4.A02;
            if (A1b) {
                wDSButton.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
            } else {
                wDSButton.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
            }
            AnonymousClass4ZN r1 = r4.A05;
            if (r1 != null) {
                charSequence = r1.A03(A14());
            } else {
                charSequence = null;
            }
            wDSButton.setText(charSequence);
            wDSButton.setVisibility(0);
            return;
        }
        AnonymousClass3MW.A1M();
        throw null;
    }

    public CallConfirmationSheet() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5CB(new AnonymousClass5CA(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(CallConfirmationSheetViewModel.class);
        this.A0B = C99274sY.A00(new AnonymousClass5CC(A002), new C155287sV(this, A002), new C155277sU(A002), A15);
    }

    public void A1r() {
        super.A1r();
        this.A00 = null;
        this.A04 = null;
        this.A05 = null;
        C37451pZ r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
        C37451pZ r02 = this.A02;
        if (r02 != null) {
            r02.A02();
        }
    }
}
