package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.5mI  reason: invalid class name and case insensitive filesystem */
public abstract class C112945mI extends C42011xT {
    /* JADX WARNING: type inference failed for: r3v3, types: [X.6X0, java.lang.Object] */
    public void A0B(AnonymousClass6TV r16, int i) {
        View findViewById;
        int i2;
        WaTextView waTextView;
        int i3;
        Object obj;
        AnonymousClass6TV r10 = r16;
        if (this instanceof AnonymousClass6BM) {
            ((AnonymousClass6BM) this).A00.setText(2131895498);
        } else if (this instanceof AnonymousClass6BQ) {
            AnonymousClass6BQ r5 = (AnonymousClass6BQ) this;
            AnonymousClass6B5 r102 = (AnonymousClass6B5) r10;
            View A09 = C108965cb.A09(r5, r102);
            AnonymousClass3MZ.A1O(A09, r5, r102, 44);
            WaImageView waImageView = r5.A02;
            AnonymousClass3MZ.A1O(waImageView, r5, r102, 45);
            C28931bI r2 = r5.A09;
            WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) r2.A02();
            if (waButtonWithLoader != null) {
                waButtonWithLoader.A00 = new AnonymousClass78A(r5, waButtonWithLoader, r102, 20);
            }
            TextEmojiLabel textEmojiLabel = r5.A01;
            C46162Dk r7 = r102.A06;
            textEmojiLabel.setText(r7.A0T);
            if (AnonymousClass000.A1Z(r7.A05, AnonymousClass9IW.VERIFIED)) {
                textEmojiLabel.A0O(C196929vs.A00((C18030ve) C18070vi.A0E(r5.A0D)), 2131169136);
            } else {
                textEmojiLabel.A0N();
            }
            AnonymousClass1E7 r6 = r102.A01;
            if (r6 != null) {
                r5.A04.A07(r5.A0C, r6);
            }
            if (r7.A0P()) {
                r5.A0A.A04(8);
                waImageView.setVisibility(8);
            } else if (r5.A06.A00(AnonymousClass3MY.A04(r2.A02()))) {
                r5.A0A.A04(8);
                waImageView.setVisibility(8);
                WaButtonWithLoader waButtonWithLoader2 = (WaButtonWithLoader) r2.A02();
                C18070vi.A0b(waButtonWithLoader2);
                waButtonWithLoader2.setVisibility(0);
                if (r102.A05) {
                    waButtonWithLoader2.A02();
                } else {
                    waButtonWithLoader2.A01();
                }
                if (AnonymousClass000.A1Z(r7.A02, C179509Ig.GUEST)) {
                    waButtonWithLoader2.setVariant(C27881Xz.TONAL);
                    waButtonWithLoader2.setButtonText(2131890489);
                    waButtonWithLoader2.setSelected(false);
                } else {
                    waButtonWithLoader2.setVariant(C27881Xz.OUTLINE);
                    waButtonWithLoader2.setButtonText(2131890498);
                    waButtonWithLoader2.setSelected(true);
                }
            } else {
                boolean z = r102.A05;
                int i4 = 0;
                AnonymousClass3MX.A0D(r5.A0A).setVisibility(C72453Mb.A07(z ? 1 : 0));
                if (z) {
                    i4 = 4;
                }
                waImageView.setVisibility(i4);
                waImageView.setSelected(!AnonymousClass000.A1Z(r7.A02, C179509Ig.GUEST));
            }
            r5.A0B.A04(8);
            WaTextView waTextView2 = r5.A03;
            waTextView2.setVisibility(0);
            long j = r7.A0G;
            AnonymousClass4XM r62 = r5.A07;
            int A00 = AnonymousClass4XM.A00(r62, (int) j);
            String A01 = r62.A01(A00);
            C18070vi.A0d(A01, 1);
            AnonymousClass3MX.A1E(AnonymousClass000.A0Y(waTextView2), waTextView2, AnonymousClass000.A1b(A01, 1), 2131755092, A00);
            boolean isSelected = waImageView.isSelected();
            Context context = waImageView.getContext();
            int i5 = 2131894872;
            if (isSelected) {
                i5 = 2131890492;
            }
            waImageView.setContentDescription(C17880vN.A0q(context, textEmojiLabel.getText(), new Object[1], 0, i5));
            AnonymousClass3MW.A1Q(waImageView);
            if (r5.A05.A09()) {
                AnonymousClass10E r1 = r5.A00.A00.A01;
                C129766iK r8 = new C129766iK(A09, r102, C000200d.A00(r1.A7C), C000200d.A00(r1.A00.A5G), i);
                if (C108955ca.A0W(r8.A03).A09()) {
                    C134246qH r11 = new C134246qH();
                    View view = r8.A01;
                    ((C138876xq) r8.A04.get()).A01(new C142847Ba(r8, 1), new C142887Be(view, r11, "directory", "directory", r8.A02.A06.A0M().toString()), new Object());
                    try {
                        obj = AnonymousClass3Ma.A05(view);
                    } catch (Throwable th) {
                        obj = C108945cZ.A1J(th);
                    }
                    if (!(obj instanceof AnonymousClass1IU) && obj != null) {
                        C147117Rw r0 = C147117Rw.A01;
                        C147117Rw.A00 = AnonymousClass3MW.A0z(obj);
                    }
                }
            }
        } else if (this instanceof AnonymousClass6BL) {
        } else {
            if (this instanceof AnonymousClass6BP) {
                AnonymousClass6BP r22 = (AnonymousClass6BP) this;
                C18070vi.A0d(r10, 0);
                if (r10 instanceof AnonymousClass6B9) {
                    waTextView = r22.A02;
                    i3 = 2131889455;
                } else if (r10 instanceof AnonymousClass6BC) {
                    waTextView = r22.A02;
                    i3 = 2131889458;
                } else {
                    if (r10 instanceof AnonymousClass6BB) {
                        r22.A02.setText(2131889458);
                        WaTextView waTextView3 = r22.A01;
                        C18070vi.A0W(waTextView3);
                        waTextView3.setVisibility(8);
                    }
                    AnonymousClass3MZ.A1O(r22.A01, r22, r10, 43);
                }
                waTextView.setText(i3);
                AnonymousClass3MZ.A1O(r22.A01, r22, r10, 43);
            } else if (this instanceof AnonymousClass6BO) {
                AnonymousClass6B4 r103 = (AnonymousClass6B4) r10;
                C18070vi.A0d(r103, 0);
                View view2 = this.A0H;
                if (view2 instanceof WDSSectionHeader) {
                    WDSSectionHeader wDSSectionHeader = (WDSSectionHeader) view2;
                    if (wDSSectionHeader != null) {
                        wDSSectionHeader.setHeaderText(r103.A01);
                        findViewById = wDSSectionHeader.A07(false);
                        if (findViewById != null) {
                            i2 = 41;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    C108975cc.A0C(view2).setText(r103.A01);
                    findViewById = view2.findViewById(2131435059);
                    i2 = 42;
                }
                AnonymousClass3MZ.A1O(findViewById, this, r103, i2);
            } else if (this instanceof AnonymousClass6BN) {
                AnonymousClass6B3 r104 = (AnonymousClass6B3) r10;
                View A092 = C108965cb.A09(this, r104);
                C108975cc.A0C(A092).setText(r104.A01);
                C17880vN.A0E(A092, 2131435885).setText(r104.A00);
                AnonymousClass3MZ.A1O(A092.findViewById(2131435059), this, r104, 40);
            } else if (this instanceof AnonymousClass6BS) {
                AnonymousClass6B2 r105 = (AnonymousClass6B2) r10;
                C18070vi.A0d(r105, 0);
                RecyclerView recyclerView = ((AnonymousClass6BS) this).A00;
                C18070vi.A0W(recyclerView);
                recyclerView.setVisibility(C72453Mb.A07(AnonymousClass000.A1a(r105.A00) ? 1 : 0));
            }
        }
    }
}
