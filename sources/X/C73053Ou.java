package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.List;
import java.util.Locale;

/* renamed from: X.3Ou  reason: invalid class name and case insensitive filesystem */
public final class C73053Ou extends BaseAdapter {
    public int A00 = -1;
    public List A01;
    public C18000vb A02;
    public final Context A03;

    public long getItemId(int i) {
        return (long) i;
    }

    public int getViewTypeCount() {
        return 3;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: A00 */
    public C83294Eo getItem(int i) {
        List list = this.A01;
        if (list != null) {
            return (C83294Eo) list.get(i);
        }
        C18070vi.A11("languageItems");
        throw null;
    }

    public int getCount() {
        List list = this.A01;
        if (list != null) {
            return list.size();
        }
        C18070vi.A11("languageItems");
        throw null;
    }

    public C73053Ou(Context context, C18000vb r3) {
        this.A03 = context;
        this.A02 = r3;
    }

    public int getItemViewType(int i) {
        C83294Eo A002 = getItem(i);
        if (A002 instanceof AnonymousClass434) {
            return 0;
        }
        if (A002 instanceof AnonymousClass436) {
            return 1;
        }
        if (A002 instanceof AnonymousClass435) {
            return 2;
        }
        throw AnonymousClass3MW.A14();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        String str2;
        Locale locale;
        C83294Eo A002 = getItem(i);
        if (A002 instanceof AnonymousClass434) {
            AnonymousClass434 r5 = (AnonymousClass434) A002;
            if (view == null) {
                view = AnonymousClass3MX.A09(LayoutInflater.from(this.A03), viewGroup, 2131625777);
            }
            C18070vi.A0z(view, "null cannot be cast to non-null type com.whatsapp.WaTextView");
            ((TextView) view).setText(r5.A00);
            return view;
        }
        if (A002 instanceof AnonymousClass435) {
            AnonymousClass435 r52 = (AnonymousClass435) A002;
            str = r52.A00;
            str2 = r52.A01;
            boolean z = false;
            if (view == null) {
                view = LayoutInflater.from(this.A03).inflate(2131626965, viewGroup, false);
            }
            if (this.A00 != -1) {
                CompoundButton compoundButton = (CompoundButton) C18070vi.A05(view, 2131431935);
                if (i == this.A00) {
                    z = true;
                }
                compoundButton.setChecked(z);
            }
            C18070vi.A0b(view);
        } else {
            if (view == null) {
                view = AnonymousClass3MX.A0B(LayoutInflater.from(this.A03), viewGroup, 2131624247, false);
            }
            C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.messagetranslation.onboarding.langselector.AvailableLanguageItem");
            AnonymousClass436 r53 = (AnonymousClass436) A002;
            str = r53.A04;
            str2 = r53.A05;
            if (r53.A01) {
                AnonymousClass3MY.A1B(view, 2131430156, 8);
                Object tag = view.getTag();
                if (tag == null) {
                    tag = C72463Mc.A0M(view, 2131434196);
                }
                C18070vi.A0z(tag, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) tag;
                view.setTag(view2);
                view2.setVisibility(0);
                ProgressBar progressBar = (ProgressBar) AnonymousClass1HF.A06(view2, 2131434181);
                progressBar.setMax(r53.A02);
                progressBar.setProgress(r53.A00);
            } else {
                AnonymousClass3MY.A1B(view, 2131430156, 0);
                Object tag2 = view.getTag();
                if (tag2 == null) {
                    tag2 = C72463Mc.A0M(view, 2131434196);
                }
                C18070vi.A0z(tag2, "null cannot be cast to non-null type android.view.View");
                View view3 = (View) tag2;
                view.setTag(view3);
                view3.setVisibility(8);
            }
        }
        TextView A0E = AnonymousClass3Ma.A0E(view, 2131431936);
        A0E.setText(str);
        TextView A0E2 = AnonymousClass3Ma.A0E(view, 2131431937);
        String[] strArr = AnonymousClass1X0.A04;
        String displayLanguage = Locale.forLanguageTag(str2).getDisplayLanguage(Locale.getDefault());
        if (displayLanguage.length() > str2.length() || !str2.startsWith(displayLanguage)) {
            locale = Locale.getDefault();
        } else {
            locale = C26166Ctg.A03();
        }
        Locale forLanguageTag = Locale.forLanguageTag(str2);
        C18070vi.A0X(forLanguageTag);
        C18070vi.A0b(locale);
        String A012 = C26166Ctg.A01(C26166Ctg.A00(this.A03, str2, forLanguageTag, locale));
        A0E2.setText(A012);
        A0E.setContentDescription(A012);
        return view;
    }
}
