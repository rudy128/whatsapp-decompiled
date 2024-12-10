package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import java.util.List;

/* renamed from: X.3Oi  reason: invalid class name */
public class AnonymousClass3Oi extends ArrayAdapter {
    public final /* synthetic */ AnonymousClass3gf A00;

    private C19760yx A00(View view, ViewGroup viewGroup, AnonymousClass3rD r8) {
        AnonymousClass4SL r0;
        if (view == null) {
            AnonymousClass3gf r4 = this.A00;
            view = AnonymousClass3MX.A09(r4.getLayoutInflater(), viewGroup, 2131626114);
            r0 = new AnonymousClass4SL(view, r4.A05, (C108375bb) r4.A0g.get(), r4.A4h());
            view.setTag(r0);
        } else {
            r0 = (AnonymousClass4SL) view.getTag();
        }
        view.setTag(2131432846, r8);
        this.A00.A4y(r0, r8.A00);
        return new C19760yx(view, r0);
    }

    public int getViewTypeCount() {
        return 6;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Oi(Context context, AnonymousClass3gf r3, List list) {
        super(context, 2131626114, list);
        this.A00 = r3;
    }

    public int getItemViewType(int i) {
        Object item = getItem(i);
        C17960vV.A07(item);
        AnonymousClass4EO r1 = (AnonymousClass4EO) item;
        if (r1 instanceof AnonymousClass3rC) {
            return 0;
        }
        if (r1 instanceof C77653r7) {
            return 1;
        }
        if (r1 instanceof C77663r9) {
            return 4;
        }
        if (r1 instanceof AnonymousClass3r8) {
            return 2;
        }
        if (r1 instanceof AnonymousClass3rB) {
            return 5;
        }
        return 3;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass4L8 r0;
        String lowerCase;
        C19760yx r1;
        AnonymousClass4OT r02;
        int itemViewType = getItemViewType(i);
        AnonymousClass4EO r4 = (AnonymousClass4EO) getItem(i);
        if (itemViewType == 0) {
            int i2 = 0;
            if (view == null) {
                view = this.A00.getLayoutInflater().inflate(2131625858, viewGroup, false);
                view.setImportantForAccessibility(2);
                r0 = new AnonymousClass4L8((WDSSectionHeader) view.findViewById(2131436208));
                view.setTag(r0);
            } else {
                r0 = (AnonymousClass4L8) view.getTag();
            }
            AnonymousClass3rC r42 = (AnonymousClass3rC) r4;
            r0.A00.setHeaderText(r42.A00);
            boolean z = r42.A01;
            View findViewById = view.findViewById(2131429399);
            if (findViewById != null) {
                if (!z) {
                    i2 = 8;
                }
                findViewById.setVisibility(i2);
                return view;
            }
        } else if (itemViewType != 2) {
            if (itemViewType == 3) {
                AnonymousClass3gf r5 = this.A00;
                AnonymousClass3rA r43 = (AnonymousClass3rA) r4;
                if (view == null) {
                    view = AnonymousClass3MX.A09(r5.getLayoutInflater(), viewGroup, 2131626113);
                    r02 = new AnonymousClass4OT(view, r5.A05);
                    view.setTag(r02);
                } else {
                    r02 = (AnonymousClass4OT) view.getTag();
                }
                List list = r43.A00;
                r02.A03.A0A((AnonymousClass1E7) list.get(0), r5.A0S);
                TextEmojiLabel textEmojiLabel = r02.A02;
                if (!TextUtils.isEmpty(textEmojiLabel.getText())) {
                    r02.A01.setContentDescription(textEmojiLabel.getText());
                }
                C90084dV r2 = new C90084dV((Object) r5, (Object) list, (Object) r02, 38);
                WDSButton wDSButton = r02.A04;
                wDSButton.setOnClickListener(r2);
                r02.A00.setOnClickListener(r2);
                if (C18020vd.A00(C18040vf.A02, r5.A0E, 6739) == 1) {
                    wDSButton.setVariant(C27881Xz.OUTLINE);
                    wDSButton.setSize(AnonymousClass4D1.SMALL);
                }
                r1 = new C19760yx(view, r02);
            } else if (itemViewType == 4 || itemViewType != 5) {
                r1 = A00(view, viewGroup, (AnonymousClass3rD) r4);
            } else {
                AnonymousClass3rB r44 = (AnonymousClass3rB) r4;
                if (view == null) {
                    view = C88554a7.A00(r44.A00, viewGroup);
                }
                C825248h.A00(view, this, r44, 35);
            }
            return (View) r1.A00;
        } else {
            C19760yx A002 = A00(view, viewGroup, (AnonymousClass3rD) r4);
            View view2 = (View) A002.A00;
            AnonymousClass3gf r8 = this.A00;
            AnonymousClass4SL r9 = (AnonymousClass4SL) A002.A01;
            AnonymousClass3r8 r45 = (AnonymousClass3r8) r4;
            if (r45.A00) {
                AnonymousClass1E7 r22 = r45.A00;
                String A02 = C24921Me.A02(r8, r8.A0F, r22);
                String A022 = AnonymousClass17K.A02(r22);
                if (!TextUtils.isEmpty(A022)) {
                    if (TextUtils.isEmpty(A02)) {
                        lowerCase = "";
                    } else {
                        lowerCase = A02.toLowerCase(r8.A0F.A0N());
                    }
                    TextEmojiLabel textEmojiLabel2 = r9.A03;
                    textEmojiLabel2.setVisibility(0);
                    Resources resources = r8.getResources();
                    Object[] objArr = new Object[2];
                    objArr[0] = lowerCase;
                    textEmojiLabel2.A0R(AnonymousClass3MW.A0x(resources, A022, objArr, 1, 2131892979));
                    return view2;
                }
            }
            r9.A03.setVisibility(8);
            return view2;
        }
        return view;
    }
}
