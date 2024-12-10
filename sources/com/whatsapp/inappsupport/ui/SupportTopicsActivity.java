package com.whatsapp.inappsupport.ui;

import X.AnonymousClass000;
import X.AnonymousClass1J9;
import X.AnonymousClass1LU;
import X.AnonymousClass1MB;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4aX;
import X.AnonymousClass770;
import X.C003401n;
import X.C123626Ve;
import X.C132216mP;
import X.C137506vZ;
import X.C17880vN;
import X.C18000vb;
import X.C18070vi;
import X.C197289wS;
import X.C34001jj;
import X.C72453Mb;
import X.C75233eD;
import X.C89454cU;
import X.C89954dI;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.List;

public final class SupportTopicsActivity extends C75233eD implements AnonymousClass1J9 {
    public int A00;
    public MenuItem A01;
    public C132216mP A02;
    public AnonymousClass1MB A03;
    public AnonymousClass1LU A04;
    public List A05;
    public int A06;

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        if (this.A00 != 1) {
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(2131820594, menu);
        MenuItem findItem = menu.findItem(2131435938);
        this.A01 = findItem;
        if (findItem != null) {
            findItem.setVisible(false);
        }
        return true;
    }

    public static final void A03(C89454cU r15, SupportTopicsActivity supportTopicsActivity) {
        String str;
        String str2;
        Intent A002;
        SupportTopicsActivity supportTopicsActivity2 = supportTopicsActivity;
        int i = supportTopicsActivity2.A06;
        if (i == 1 || i == 2) {
            Intent intent = supportTopicsActivity2.getIntent();
            C18070vi.A0X(intent);
            C72453Mb.A16(supportTopicsActivity2, C123626Ve.A00(intent));
        } else if (i == 3) {
            List list = supportTopicsActivity2.A05;
            if (list != null) {
                ArrayList A14 = AnonymousClass000.A14(list);
                List list2 = supportTopicsActivity2.A05;
                if (list2 != null) {
                    ArrayList A142 = AnonymousClass000.A14(list2);
                    int i2 = 0;
                    while (true) {
                        List list3 = supportTopicsActivity2.A05;
                        if (list3 == null) {
                            break;
                        } else if (i2 < list3.size()) {
                            List list4 = supportTopicsActivity2.A05;
                            if (list4 == null) {
                                break;
                            }
                            if (((SupportTopicsFragment) list4.get(i2)).A00 != null) {
                                List list5 = supportTopicsActivity2.A05;
                                if (list5 == null) {
                                    break;
                                }
                                C89454cU r1 = ((SupportTopicsFragment) list5.get(i2)).A00;
                                if (r1 != null) {
                                    A14.add(r1.A03);
                                    A142.add(r1.A02);
                                }
                            }
                            i2++;
                        } else {
                            if (r15 != null) {
                                A14.add(r15.A03);
                                A142.add(r15.A02);
                            }
                            Bundle bundleExtra = supportTopicsActivity2.getIntent().getBundleExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle");
                            bundleExtra.getClass();
                            String string = bundleExtra.getString("com.whatsapp.support.DescribeProblemActivity.from");
                            if (string == null) {
                                str = "support_topics";
                            } else {
                                str = string;
                            }
                            Bundle bundleExtra2 = supportTopicsActivity2.getIntent().getBundleExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle");
                            bundleExtra2.getClass();
                            boolean A003 = C197289wS.A00(string);
                            C132216mP r10 = supportTopicsActivity2.A02;
                            if (r10 != null) {
                                if (A003) {
                                    A002 = r10.A00(supportTopicsActivity2, bundleExtra2, (Integer) null, str, A142, A14);
                                } else {
                                    AnonymousClass1MB r0 = supportTopicsActivity2.A03;
                                    if (r0 != null) {
                                        A002 = r10.A00.A00(bundleExtra2, (AnonymousClass770) null, (Integer) null, str, (String) null, A142, A14, r0.A00());
                                    } else {
                                        str2 = "supportGatingUtils";
                                    }
                                }
                                C18070vi.A0b(A002);
                                supportTopicsActivity2.startActivity(A002);
                                return;
                            }
                            str2 = "sendFeedback";
                            C18070vi.A11(str2);
                        }
                    }
                }
            }
            C18070vi.A11("supportTopicsFragments");
            throw null;
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 15 && i2 == -1) {
            Intent intent2 = getIntent();
            C18070vi.A0X(intent2);
            setResult(-1, C123626Ve.A00(intent2));
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        List list = this.A05;
        if (list != null) {
            if (AnonymousClass000.A1a(list)) {
                List list2 = this.A05;
                if (list2 != null) {
                    list2.remove(AnonymousClass3MX.A01(list2));
                    List list3 = this.A05;
                    if (list3 != null) {
                        if (AnonymousClass000.A1a(list3)) {
                            List list4 = this.A05;
                            if (list4 != null) {
                                SupportTopicsFragment supportTopicsFragment = (SupportTopicsFragment) list4.get(AnonymousClass3MX.A01(list4));
                                MenuItem menuItem = this.A01;
                                if (menuItem != null) {
                                    C89454cU r1 = supportTopicsFragment.A00;
                                    boolean z = false;
                                    if (r1 != null) {
                                        z = r1.A06;
                                    }
                                    menuItem.setVisible(z);
                                }
                            }
                        }
                    }
                }
            }
            super.onBackPressed();
            return;
        }
        C18070vi.A11("supportTopicsFragments");
        throw null;
    }

    public void onBackStackChanged() {
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            int i = 2131893747;
            if (AnonymousClass3MX.A0O(this).A0K() == 0) {
                i = 2131893746;
            }
            supportActionBar.A0S(getString(i));
            supportActionBar.A0W(true);
        }
    }

    public void onCreate(Bundle bundle) {
        this.A00 = getIntent().getIntExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 1);
        this.A06 = getIntent().getIntExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", 3);
        if (this.A00 == 2) {
            String A0F = C18070vi.A0F(this, 2131899401);
            setTheme(2132083998);
            super.onCreate(bundle);
            setTitle(A0F);
            setContentView(2131627157);
            findViewById(2131436275).setVisibility(0);
            Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131436270);
            C18000vb r2 = this.A00;
            toolbar.setNavigationIcon((Drawable) AnonymousClass4aX.A0A(this, getResources(), getResources().getDrawable(2131231675), r2));
            toolbar.setTitle((CharSequence) A0F);
            toolbar.setNavigationOnClickListener(new C89954dI(this, 9));
            C137506vZ.A00(toolbar);
            setSupportActionBar(toolbar);
            TextView A0L = AnonymousClass3MX.A0L(this, 2131429467);
            A0L.setVisibility(0);
            C89954dI.A00(A0L, this, 10);
            if (getIntent().getBooleanExtra("from_contact_us_ai_fallback_email_screen", false)) {
                A0L.setText(2131887595);
            }
        } else {
            super.onCreate(bundle);
            setContentView(2131627157);
            C003401n supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0S(getString(2131893746));
                supportActionBar.A0W(true);
            }
        }
        this.A05 = AnonymousClass000.A13();
        getSupportFragmentManager().A0E.add(this);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics");
        parcelableArrayListExtra.getClass();
        Hilt_SupportTopicsFragment hilt_SupportTopicsFragment = new Hilt_SupportTopicsFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putParcelable("parent_topic", (Parcelable) null);
        A0D.putParcelableArrayList("topics", parcelableArrayListExtra);
        hilt_SupportTopicsFragment.A1R(A0D);
        C34001jj r1 = new C34001jj(AnonymousClass3MX.A0O(this));
        r1.A08(hilt_SupportTopicsFragment, 2131435939);
        r1.A01();
        List list = this.A05;
        if (list == null) {
            C18070vi.A11("supportTopicsFragments");
            throw null;
        } else {
            list.add(hilt_SupportTopicsFragment);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 16908332) {
            List list = this.A05;
            if (list == null) {
                C18070vi.A11("supportTopicsFragments");
                throw null;
            } else if (AnonymousClass000.A1a(list)) {
                onBackPressed();
                return true;
            }
        }
        if (menuItem.getItemId() != 2131435938) {
            return super.onOptionsItemSelected(menuItem);
        }
        A03((C89454cU) null, this);
        return true;
    }
}
