package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.imageview.ShapeableImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.6uO  reason: invalid class name and case insensitive filesystem */
public abstract class C136786uO {
    public View A00;
    public NestedScrollView A01;
    public Chip A02;
    public WaImageButton A03;
    public WaImageButton A04;

    public void A01() {
        this.A01 = null;
        this.A00 = null;
    }

    public void A02(Context context, AnonymousClass02n r5, C140016zo r6) {
        C18070vi.A0d(r5, 2);
        String str = r6.A05;
        WaImageButton waImageButton = this.A04;
        int i = 0;
        if (str == null) {
            i = 8;
        }
        if (waImageButton != null) {
            waImageButton.setVisibility(i);
        }
        WaImageButton waImageButton2 = this.A03;
        if (waImageButton2 != null) {
            waImageButton2.setVisibility(i);
        }
        Chip chip = this.A02;
        if (chip != null) {
            AnonymousClass3MZ.A1O(chip, this, r5, 25);
        }
    }

    public final void A03(View view, AnonymousClass1FL r9, MetaAiVoiceViewModel metaAiVoiceViewModel) {
        View inflate;
        C18070vi.A0d(metaAiVoiceViewModel, 1);
        if (this.A01 == null) {
            if (this instanceof AnonymousClass6AR) {
                inflate = ((ViewStub) C18070vi.A05(view, 2131436919)).inflate();
                A00(inflate, (AnonymousClass6AR) this);
            } else if (this instanceof AnonymousClass6AQ) {
                AnonymousClass6AQ r3 = (AnonymousClass6AQ) this;
                inflate = ((ViewStub) C18070vi.A05(view, 2131436918)).inflate();
                AnonymousClass6AR r0 = r3.A05;
                C72453Mb.A1R(inflate);
                A00(inflate, r0);
                r3.A01 = (Chip) inflate.findViewById(2131434951);
                RecyclerView A0Q = AnonymousClass3MX.A0Q(inflate, 2131434953);
                if (A0Q != null) {
                    r3.A00 = A0Q;
                    AnonymousClass3Ma.A15(view.getContext(), A0Q);
                    A0Q.A0r(new C112545le(r3));
                    new C111705kI(r3.A04).A08(A0Q);
                    C111965ki r02 = new C111965ki(r3.A03);
                    r3.A02 = r02;
                    A0Q.setAdapter(r02);
                }
            } else if (this instanceof AnonymousClass6AS) {
                AnonymousClass6AS r32 = (AnonymousClass6AS) this;
                inflate = ((ViewStub) C18070vi.A05(view, 2131436916)).inflate();
                AnonymousClass6AR r03 = r32.A06;
                C18070vi.A0b(inflate);
                C18070vi.A0d(inflate, 0);
                A00(inflate, r03);
                int dimensionPixelSize = AnonymousClass000.A0Y(view).getDimensionPixelSize(2131168777);
                View A05 = C18070vi.A05(inflate, 2131436216);
                View A052 = C18070vi.A05(inflate, 2131427485);
                A05.setPadding(dimensionPixelSize, A05.getPaddingTop(), dimensionPixelSize, A05.getPaddingBottom());
                A052.setPadding(dimensionPixelSize, A052.getPaddingTop(), dimensionPixelSize, A052.getPaddingBottom());
                RecyclerView A0U = C108945cZ.A0U(inflate, 2131436915);
                r32.A00 = A0U;
                C108965cb.A0z(view.getContext(), A0U);
                new C111705kI(r32.A05).A08(A0U);
                A0U.A0r(new C112535ld(r32));
                C111955kh r04 = new C111955kh(r32);
                r32.A01 = r04;
                A0U.setAdapter(r04);
                C18070vi.A0z(inflate, "null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
            } else {
                inflate = ((ViewStub) C18070vi.A05(view, 2131436914)).inflate();
                ((AnonymousClass6AT) this).A01 = (ShapeableImageView) inflate.findViewById(2131431102);
            }
            NestedScrollView nestedScrollView = (NestedScrollView) inflate;
            this.A01 = nestedScrollView;
            if (this.A00 == null) {
                View A053 = C18070vi.A05(nestedScrollView, 2131427485);
                this.A00 = A053;
                Chip chip = (Chip) A053.findViewById(2131435359);
                this.A02 = chip;
                if (chip != null) {
                    chip.setText(2131898091);
                }
                Chip chip2 = this.A02;
                if (chip2 != null) {
                    AnonymousClass3MY.A0w(nestedScrollView.getContext(), chip2, 2131898090);
                }
                WaImageButton waImageButton = (WaImageButton) A053.findViewById(2131433998);
                this.A04 = waImageButton;
                if (waImageButton != null) {
                    C90054dS.A00(waImageButton, metaAiVoiceViewModel, 12);
                }
                WaImageButton waImageButton2 = (WaImageButton) A053.findViewById(2131432939);
                this.A03 = waImageButton2;
                if (waImageButton2 != null) {
                    AnonymousClass3MZ.A1O(waImageButton2, r9, metaAiVoiceViewModel, 24);
                }
            }
        }
    }

    public boolean A04(Intent intent, C140016zo r24) {
        File file;
        String str;
        ArrayList A0r;
        C33251iW r0;
        Intent intent2 = intent;
        C140016zo r1 = r24;
        if (this instanceof AnonymousClass6AR) {
            AnonymousClass6AR r4 = (AnonymousClass6AR) this;
            C134376qU r02 = r1.A02;
            if (r02 == null) {
                return false;
            }
            str = r02.A00;
            A0r = C72463Mc.A0r(intent2, AnonymousClass1BI.class);
            r0 = r4.A02;
        } else if (this instanceof AnonymousClass6AQ) {
            return false;
        } else {
            if (this instanceof AnonymousClass6AS) {
                AnonymousClass6AS r42 = (AnonymousClass6AS) this;
                C134376qU r03 = r1.A02;
                if (r03 == null) {
                    return false;
                }
                str = r03.A00;
                C134396qW r04 = r1.A03;
                if (r04 == null) {
                    return false;
                }
                List<C135826sp> list = r04.A00;
                ArrayList A0D = C29351c6.A0D(list);
                for (C135826sp r05 : list) {
                    A0D.add(r05.A03);
                }
                if (!A0D.isEmpty()) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    if (str.length() > 0) {
                        A10.append(str);
                        A10.append("\n\n");
                    }
                    int i = 0;
                    for (Object next : A0D) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AnonymousClass1ZU.A0B();
                            throw null;
                        }
                        A10.append((String) next);
                        if (i != new C25411Oc(0, AnonymousClass3MX.A01(A0D)).A01) {
                            A10.append("\n");
                        }
                        i = i2;
                    }
                    str = C18070vi.A0H(A10);
                }
                A0r = C72463Mc.A0r(intent2, AnonymousClass1BI.class);
                r0 = r42.A03;
            } else {
                AnonymousClass6AT r43 = (AnonymousClass6AT) this;
                ArrayList A0r2 = C72463Mc.A0r(intent2, AnonymousClass1BI.class);
                String stringExtra = intent2.getStringExtra("file_path");
                if (stringExtra != null) {
                    file = C108945cZ.A17(stringExtra);
                } else {
                    file = null;
                }
                try {
                    r43.A04.A04(Uri.fromFile(file), (AnonymousClass85B) null, (AnonymousClass206) null, (C692236j) null, 0, C108975cc.A0X(), "", (String) null, A0r2, (List) null, (List) null, (Map) null, 3, 1, 0, false, false, false, false, false);
                    return true;
                } catch (Exception e) {
                    Log.e("MetaAiVoiceViewModel/sendImage/exception ", e);
                    return false;
                }
            }
        }
        r0.A0p(A0r, str);
        return true;
    }

    public static void A00(View view, AnonymousClass6AR r2) {
        r2.A01 = (TextEmojiLabel) view.findViewById(2131436078);
        r2.A00 = (TextEmojiLabel) view.findViewById(2131436077);
    }
}
