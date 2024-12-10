package com.whatsapp.registration.phonenumberentry;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1M2;
import X.AnonymousClass1M9;
import X.AnonymousClass3MW;
import X.AnonymousClass3Ma;
import X.C000200d;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C19880zA;
import X.C19890zB;
import X.C22971Dz;
import X.C29431cG;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C74713cF;
import X.C90614eM;
import X.C90664eR;
import X.C91034f2;
import X.C99014s7;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.RadioButton;
import android.widget.ScrollView;
import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.registration.NotifyContactsSelector;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ChangeNumberNotifyContacts extends AnonymousClass1FY {
    public int A00;
    public View A01;
    public View A02;
    public ScrollView A03;
    public SwitchCompat A04;
    public C19880zA A05;
    public AnonymousClass1M9 A06;
    public AnonymousClass1CJ A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public List A0A;
    public int A0B;
    public View A0C;
    public RadioButton A0D;
    public RadioButton A0E;
    public RadioButton A0F;
    public TextEmojiLabel A0G;
    public boolean A0H;

    public ChangeNumberNotifyContacts() {
        this(0);
    }

    public static final void A0Q(ChangeNumberNotifyContacts changeNumberNotifyContacts) {
        String str;
        changeNumberNotifyContacts.A00 = 2;
        View view = changeNumberNotifyContacts.A01;
        if (view == null) {
            str = "changeNumberRadioButtonsContainer";
        } else {
            view.setVisibility(0);
            List list = changeNumberNotifyContacts.A0A;
            if (list != null) {
                list.clear();
            }
            List list2 = changeNumberNotifyContacts.A0A;
            ArrayList A13 = AnonymousClass000.A13();
            HashSet A12 = C17880vN.A12();
            changeNumberNotifyContacts.A0c(A13);
            Iterator it = A13.iterator();
            while (it.hasNext()) {
                AnonymousClass1BI r1 = (AnonymousClass1BI) C72473Md.A0X(it);
                if (r1 != null) {
                    AnonymousClass1CJ r0 = changeNumberNotifyContacts.A07;
                    if (r0 == null) {
                        str = "chatsCache";
                    } else if (r0.A0P(r1)) {
                        A12.add(r1);
                    }
                }
            }
            if (list2 != null) {
                list2.addAll(A12);
                return;
            }
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> arrayList = null;
        if (i != 1) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
                return;
            } else if (i2 != -1) {
                Log.i("ChangeNumberNotifyContacts/listmembersselector/permissions denied");
                SwitchCompat switchCompat = this.A04;
                if (switchCompat == null) {
                    C18070vi.A11("notifyContactsSwitch");
                    throw null;
                } else {
                    switchCompat.setChecked(false);
                    return;
                }
            } else {
                A0Q(this);
            }
        } else if (i2 == -1) {
            Class<UserJid> cls = UserJid.class;
            if (intent != null) {
                arrayList = intent.getStringArrayListExtra("jids");
            }
            this.A0A = C22971Dz.A0A(cls, arrayList);
            this.A00 = 3;
        }
        A0V(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        ScrollView scrollView = this.A03;
        if (scrollView == null) {
            C18070vi.A11("scrollView");
            throw null;
        } else {
            C90664eR.A00(scrollView.getViewTreeObserver(), this, 8);
        }
    }

    public final void onRadioButtonClicked(View view) {
        C18070vi.A0d(view, 0);
        int id = view.getId();
        if (id == 2131428964) {
            if (this.A00 != 1) {
                this.A00 = 1;
                List list = this.A0A;
                if (list != null) {
                    list.clear();
                }
                A4b(this.A0A);
            } else {
                return;
            }
        } else if (id == 2131428966) {
            if (this.A00 != 2) {
                A0Q(this);
            } else {
                return;
            }
        } else if (id == 2131428968) {
            startActivityForResult(new Intent(this, NotifyContactsSelector.class), 1);
            return;
        } else {
            return;
        }
        A0V(this);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        String str;
        C18070vi.A0d(bundle, 0);
        SwitchCompat switchCompat = this.A04;
        if (switchCompat == null) {
            str = "notifyContactsSwitch";
        } else {
            boolean isChecked = switchCompat.isChecked();
            super.onRestoreInstanceState(bundle);
            View view = this.A02;
            if (view == null) {
                str = "notifyContactsContainer";
            } else {
                view.getViewTreeObserver().addOnPreDrawListener(new C90614eM(this, isChecked));
                return;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        super.onSaveInstanceState(bundle);
        List list = this.A0A;
        if (list != null) {
            bundle.putStringArrayList("selectedJids", C22971Dz.A0B(list));
            bundle.putInt("mode", this.A00);
            return;
        }
        throw C17880vN.A0g();
    }

    public static final void A03(ChangeNumberNotifyContacts changeNumberNotifyContacts) {
        String str;
        float f;
        ScrollView scrollView = changeNumberNotifyContacts.A03;
        if (scrollView == null) {
            str = "scrollView";
        } else {
            boolean canScrollVertically = scrollView.canScrollVertically(1);
            str = "bottomButtonContainer";
            View view = changeNumberNotifyContacts.A0C;
            if (canScrollVertically) {
                if (view != null) {
                    f = (float) changeNumberNotifyContacts.A0B;
                }
            } else if (view != null) {
                f = 0.0f;
            }
            view.setElevation(f);
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0V(ChangeNumberNotifyContacts changeNumberNotifyContacts) {
        int i;
        String str;
        int i2 = changeNumberNotifyContacts.A00;
        boolean z = true;
        SwitchCompat switchCompat = changeNumberNotifyContacts.A04;
        if (i2 == 0) {
            if (switchCompat != null) {
                switchCompat.setChecked(false);
                TextEmojiLabel textEmojiLabel = changeNumberNotifyContacts.A0G;
                if (textEmojiLabel != null) {
                    textEmojiLabel.setText(2131888055);
                    View view = changeNumberNotifyContacts.A01;
                    if (view != null) {
                        view.setVisibility(8);
                        RadioButton radioButton = changeNumberNotifyContacts.A0E;
                        if (radioButton != null) {
                            radioButton.setChecked(true);
                            return;
                        }
                    }
                    C18070vi.A11("changeNumberRadioButtonsContainer");
                    throw null;
                }
                C18070vi.A11("amountNotifiedTextView");
                throw null;
            }
            C18070vi.A11("notifyContactsSwitch");
            throw null;
        }
        if (switchCompat != null) {
            switchCompat.setChecked(true);
            List list = changeNumberNotifyContacts.A0A;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, i, 0);
            String A0K = changeNumberNotifyContacts.A00.A0K(objArr, 2131755043, (long) i);
            C18070vi.A0X(A0K);
            Spanned fromHtml = Html.fromHtml(A0K);
            C18070vi.A0X(fromHtml);
            SpannableStringBuilder A092 = AnonymousClass3MW.A09(fromHtml);
            URLSpan[] A1b = C72473Md.A1b(fromHtml, 0);
            if (!(A1b == null || A1b.length == 0)) {
                C99014s7 r8 = new C99014s7(A1b);
                while (r8.hasNext()) {
                    URLSpan uRLSpan = (URLSpan) r8.next();
                    if ("contacts-link".equals(uRLSpan.getURL())) {
                        int spanStart = A092.getSpanStart(uRLSpan);
                        int spanEnd = A092.getSpanEnd(uRLSpan);
                        int spanFlags = A092.getSpanFlags(uRLSpan);
                        A092.removeSpan(uRLSpan);
                        A092.setSpan(new C74713cF(changeNumberNotifyContacts), spanStart, spanEnd, spanFlags);
                    }
                }
            }
            TextEmojiLabel textEmojiLabel2 = changeNumberNotifyContacts.A0G;
            if (textEmojiLabel2 != null) {
                AnonymousClass3Ma.A1L(changeNumberNotifyContacts.A0E, textEmojiLabel2);
                TextEmojiLabel textEmojiLabel3 = changeNumberNotifyContacts.A0G;
                if (textEmojiLabel3 != null) {
                    AnonymousClass3Ma.A1K(textEmojiLabel3, changeNumberNotifyContacts.A08);
                    TextEmojiLabel textEmojiLabel4 = changeNumberNotifyContacts.A0G;
                    if (textEmojiLabel4 != null) {
                        textEmojiLabel4.setText(A092);
                        View view2 = changeNumberNotifyContacts.A01;
                        if (view2 != null) {
                            view2.setVisibility(0);
                            RadioButton radioButton2 = changeNumberNotifyContacts.A0D;
                            if (radioButton2 == null) {
                                str = "changeNumberAllBtn";
                            } else {
                                radioButton2.setChecked(AnonymousClass000.A1T(changeNumberNotifyContacts.A00, 1));
                                RadioButton radioButton3 = changeNumberNotifyContacts.A0E;
                                if (radioButton3 != null) {
                                    radioButton3.setChecked(AnonymousClass000.A1T(changeNumberNotifyContacts.A00, 2));
                                    RadioButton radioButton4 = changeNumberNotifyContacts.A0F;
                                    if (radioButton4 == null) {
                                        str = "changeNumberCustomBtn";
                                    } else {
                                        if (changeNumberNotifyContacts.A00 != 3) {
                                            z = false;
                                        }
                                        radioButton4.setChecked(z);
                                        return;
                                    }
                                }
                            }
                            C18070vi.A11(str);
                            throw null;
                        }
                        C18070vi.A11("changeNumberRadioButtonsContainer");
                        throw null;
                    }
                }
            }
            C18070vi.A11("amountNotifiedTextView");
            throw null;
        }
        C18070vi.A11("notifyContactsSwitch");
        throw null;
        C18070vi.A11("changeNumberChatsBtn");
        throw null;
    }

    private final void A0c(ArrayList arrayList) {
        String str;
        AnonymousClass1M9 r0 = this.A06;
        if (r0 != null) {
            AnonymousClass1M2.A0C(r0.A04, arrayList, 1, false, false, true, false, false);
            if (!C18020vd.A05(C18040vf.A02, r0.A0H, 3764)) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (C22971Dz.A0T(C72453Mb.A0l(it))) {
                        it.remove();
                    }
                }
            }
            AnonymousClass00H r02 = this.A08;
            if (r02 != null) {
                Set A0A2 = AnonymousClass3MW.A0V(r02).A0A();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (C29431cG.A18(A0A2, C72473Md.A0X(it2))) {
                        it2.remove();
                    }
                }
                return;
            }
            str = "blockListManager";
        } else {
            str = "contactManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A0H) {
            this.A0H = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A08 = C000200d.A00(A0L.A0x);
            this.A07 = AnonymousClass3Ma.A0d(A0L);
            this.A09 = C000200d.A00(A0L.A2b);
            this.A06 = AnonymousClass10E.A4z(A0L);
            this.A05 = C19890zB.A00;
        }
    }

    public final void A4b(List list) {
        ArrayList A13 = AnonymousClass000.A13();
        A0c(A13);
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            Jid A0X = C72473Md.A0X(it);
            if (!(A0X == null || list == null)) {
                list.add(A0X);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x024b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r15) {
        /*
            r14 = this;
            super.onCreate(r15)
            r0 = 2131888080(0x7f1207d0, float:1.9410785E38)
            r14.setTitle(r0)
            X.01n r0 = r14.getSupportActionBar()
            if (r0 == 0) goto L_0x0253
            r3 = 1
            r0.A0W(r3)
            r0.A0G()
            r0 = 2131624514(0x7f0e0242, float:1.887621E38)
            r14.setContentView((int) r0)
            r0 = 2131429339(0x7f0b07db, float:1.8480348E38)
            android.view.View r1 = r14.findViewById(r0)
            r0 = 28
            X.AnonymousClass3MZ.A1L(r1, r14, r0)
            r0 = 2131428971(0x7f0b066b, float:1.8479602E38)
            android.view.View r8 = X.AnonymousClass3MY.A0H(r14, r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            X.0vb r4 = r14.A00
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            r6 = 43
            r2.append(r6)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "oldJid"
            java.lang.String r0 = r1.getStringExtra(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            java.lang.String r2 = r4.A0G(r0)
            X.0vb r5 = r14.A00
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            r4.append(r6)
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "newJid"
            java.lang.String r0 = r1.getStringExtra(r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r4)
            java.lang.String r10 = r5.A0G(r0)
            r4 = 2131888042(0x7f1207aa, float:1.9410708E38)
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r1 = 0
            r0[r1] = r2
            java.lang.String r0 = X.AnonymousClass3Ma.A10(r14, r10, r0, r3, r4)
            X.C18070vi.A0b(r2)
            r13 = 0
            int r12 = X.AnonymousClass1YF.A0F(r0, r2, r1, r1)
            X.C18070vi.A0b(r10)
            int r7 = X.AnonymousClass1YF.A0F(r0, r10, r1, r1)
            android.text.SpannableString r6 = new android.text.SpannableString
            r6.<init>(r0)
            r11 = 2130971198(0x7f040a3e, float:1.7551128E38)
            r9 = 2131102533(0x7f060b45, float:1.7817507E38)
            int r1 = X.AnonymousClass3Ma.A00(r14, r11, r9)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r1 = r2.length()
            int r1 = r1 + r12
            r4 = 17
            r6.setSpan(r0, r12, r1, r4)
            java.lang.String r2 = "sans-serif-medium"
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r2)
            r6.setSpan(r0, r12, r1, r4)
            int r1 = X.AnonymousClass3Ma.A00(r14, r11, r9)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            int r1 = r10.length()
            int r1 = r1 + r7
            r6.setSpan(r0, r7, r1, r4)
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r2)
            r6.setSpan(r0, r7, r1, r4)
            r8.setText(r6)
            r0 = 2131434837(0x7f0b1d55, float:1.84915E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r14, r0)
            android.widget.ScrollView r0 = (android.widget.ScrollView) r0
            r14.A03 = r0
            r0 = 2131433216(0x7f0b1700, float:1.8488211E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r14, r0)
            r14.A02 = r0
            r0 = 2131433217(0x7f0b1701, float:1.8488213E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r14, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r14.A04 = r0
            r0 = 2131428992(0x7f0b0680, float:1.8479644E38)
            android.view.View r1 = X.AnonymousClass3MY.A0H(r14, r0)
            r14.A01 = r1
            java.lang.String r6 = "changeNumberRadioButtonsContainer"
            r0 = 2131428965(0x7f0b0665, float:1.847959E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r1, r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r14.A0D = r0
            r0 = 2131428964(0x7f0b0664, float:1.8479587E38)
            android.view.View r1 = r14.findViewById(r0)
            r0 = 29
            X.AnonymousClass3MZ.A1L(r1, r14, r0)
            android.view.View r1 = r14.A01
            if (r1 == 0) goto L_0x024f
            r0 = 2131428967(0x7f0b0667, float:1.8479593E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r1, r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r14.A0E = r0
            androidx.appcompat.widget.SwitchCompat r1 = r14.A04
            if (r1 != 0) goto L_0x0123
            java.lang.String r0 = "notifyContactsSwitch"
        L_0x011f:
            X.C18070vi.A11(r0)
            throw r13
        L_0x0123:
            r0 = 19
            X.C90874em.A00(r1, r14, r0)
            android.view.View r1 = r14.A02
            if (r1 != 0) goto L_0x012f
            java.lang.String r0 = "notifyContactsContainer"
            goto L_0x011f
        L_0x012f:
            r0 = 30
            X.AnonymousClass3MZ.A1L(r1, r14, r0)
            r0 = 2131428966(0x7f0b0666, float:1.8479591E38)
            android.view.View r1 = r14.findViewById(r0)
            r0 = 31
            X.AnonymousClass3MZ.A1L(r1, r14, r0)
            android.view.View r1 = r14.A01
            if (r1 == 0) goto L_0x024f
            r0 = 2131428969(0x7f0b0669, float:1.8479597E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r1, r0)
            android.widget.RadioButton r0 = (android.widget.RadioButton) r0
            r14.A0F = r0
            r0 = 2131428968(0x7f0b0668, float:1.8479595E38)
            android.view.View r1 = r14.findViewById(r0)
            r0 = 32
            X.AnonymousClass3MZ.A1L(r1, r14, r0)
            r0 = 2131428981(0x7f0b0675, float:1.8479622E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r14, r0)
            com.whatsapp.TextEmojiLabel r0 = (com.whatsapp.TextEmojiLabel) r0
            r14.A0G = r0
            r0 = 2131428324(0x7f0b03e4, float:1.847829E38)
            android.view.View r0 = X.AnonymousClass3MY.A0H(r14, r0)
            r14.A0C = r0
            java.lang.String r1 = "mode"
            r4 = 3
            if (r15 == 0) goto L_0x0229
            int r0 = r15.getInt(r1)
            r14.A00 = r0
            if (r0 != r4) goto L_0x0186
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "selectedJids"
            java.util.ArrayList r0 = X.AnonymousClass3MZ.A1A(r15, r1, r0)
        L_0x0184:
            r14.A0A = r0
        L_0x0186:
            java.util.List r0 = r14.A0A
            if (r0 != 0) goto L_0x0190
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r14.A0A = r0
        L_0x0190:
            X.00H r0 = r14.A09
            if (r0 == 0) goto L_0x024b
            boolean r0 = X.C72463Mc.A1W(r0)
            if (r0 != 0) goto L_0x01e4
            X.0ve r0 = r14.A0E
            boolean r0 = X.AnonymousClass3MX.A1W(r0)
            if (r0 != 0) goto L_0x01e4
            r0 = 0
            r14.A00 = r0
            android.view.View r1 = r14.A01
            if (r1 == 0) goto L_0x024f
            r0 = 8
            r1.setVisibility(r0)
            java.util.List r0 = r14.A0A
            if (r0 == 0) goto L_0x01b5
            r0.clear()
        L_0x01b5:
            A0V(r14)
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131168631(0x7f070d77, float:1.795157E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r14.A0B = r0
            android.widget.ScrollView r0 = r14.A03
            if (r0 == 0) goto L_0x0247
            android.view.ViewTreeObserver r2 = r0.getViewTreeObserver()
            r1 = 5
            X.4eT r0 = new X.4eT
            r0.<init>(r14, r1)
            r2.addOnScrollChangedListener(r0)
            android.widget.ScrollView r0 = r14.A03
            if (r0 == 0) goto L_0x0247
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 8
            X.C90664eR.A00(r1, r14, r0)
            return
        L_0x01e4:
            int r0 = r14.A00
            if (r0 != r3) goto L_0x01f7
            r14.A00 = r3
            java.util.List r0 = r14.A0A
            if (r0 == 0) goto L_0x01f1
            r0.clear()
        L_0x01f1:
            java.util.List r0 = r14.A0A
            r14.A4b(r0)
            goto L_0x01b5
        L_0x01f7:
            if (r0 != r5) goto L_0x01fd
            A0Q(r14)
            goto L_0x01b5
        L_0x01fd:
            if (r0 != r4) goto L_0x01b5
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r14.A4b(r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            java.util.List r0 = r14.A0A
            if (r0 == 0) goto L_0x01b5
            java.util.Iterator r1 = r0.iterator()
            if (r1 == 0) goto L_0x01b5
        L_0x0215:
            boolean r0 = r1.hasNext()
            if (r0 != r3) goto L_0x01b5
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x0215
            r1.remove()
            goto L_0x0215
        L_0x0229:
            android.content.Intent r0 = r14.getIntent()
            int r0 = r0.getIntExtra(r1, r5)
            r14.A00 = r0
            if (r0 != r4) goto L_0x0186
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            android.content.Intent r1 = r14.getIntent()
            java.lang.String r0 = "preselectedJids"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)
            java.util.ArrayList r0 = X.C22971Dz.A0A(r2, r0)
            goto L_0x0184
        L_0x0247:
            java.lang.String r0 = "scrollView"
            goto L_0x011f
        L_0x024b:
            java.lang.String r0 = "contactAccessHelper"
            goto L_0x011f
        L_0x024f:
            X.C18070vi.A11(r6)
            throw r13
        L_0x0253:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.phonenumberentry.ChangeNumberNotifyContacts.onCreate(android.os.Bundle):void");
    }

    public ChangeNumberNotifyContacts(int i) {
        this.A0H = false;
        C91034f2.A00(this, 6);
    }
}
