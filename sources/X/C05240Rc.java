package X;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* renamed from: X.0Rc  reason: invalid class name and case insensitive filesystem */
public class C05240Rc implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C05240Rc(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onClick(View view) {
        Message message;
        Message obtain;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        if (this.A00 != 0) {
            SearchView searchView = (SearchView) this.A01;
            if (view == searchView.A0Z) {
                searchView.A0H();
            } else if (view == searchView.A0X) {
                searchView.A0G();
            } else if (view == searchView.A0Y) {
                searchView.A0I();
            } else if (view == searchView.A0a) {
                SearchableInfo searchableInfo = searchView.A00;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.A0V);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                str4 = null;
                            } else {
                                str4 = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", str4);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            Intent intent2 = searchView.A0U;
                            ComponentName searchActivity2 = searchableInfo.getSearchActivity();
                            Intent intent3 = new Intent("android.intent.action.SEARCH");
                            intent3.setComponent(searchActivity2);
                            PendingIntent activity = PendingIntent.getActivity(searchView.getContext(), 0, intent3, 1107296256);
                            Bundle bundle = new Bundle();
                            Bundle bundle2 = searchView.A01;
                            if (bundle2 != null) {
                                bundle.putParcelable("app_data", bundle2);
                            }
                            Intent intent4 = new Intent(intent2);
                            Resources resources = searchView.getResources();
                            if (searchableInfo.getVoiceLanguageModeId() != 0) {
                                str = resources.getString(searchableInfo.getVoiceLanguageModeId());
                            } else {
                                str = "free_form";
                            }
                            String str5 = null;
                            if (searchableInfo.getVoicePromptTextId() != 0) {
                                str2 = resources.getString(searchableInfo.getVoicePromptTextId());
                            } else {
                                str2 = null;
                            }
                            if (searchableInfo.getVoiceLanguageId() != 0) {
                                str3 = resources.getString(searchableInfo.getVoiceLanguageId());
                            } else {
                                str3 = null;
                            }
                            if (searchableInfo.getVoiceMaxResults() != 0) {
                                i = searchableInfo.getVoiceMaxResults();
                            } else {
                                i = 1;
                            }
                            intent4.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
                            intent4.putExtra("android.speech.extra.PROMPT", str2);
                            intent4.putExtra("android.speech.extra.LANGUAGE", str3);
                            intent4.putExtra("android.speech.extra.MAX_RESULTS", i);
                            if (searchActivity2 != null) {
                                str5 = searchActivity2.flattenToShortString();
                            }
                            intent4.putExtra("calling_package", str5);
                            intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
                            intent4.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
                            searchView.getContext().startActivity(intent4);
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.A0b) {
                searchView.A0F();
            }
        } else {
            AnonymousClass0QH r1 = (AnonymousClass0QH) this.A01;
            if (((view == r1.A0H && (message = r1.A0C) != null) || ((view == r1.A0F && (message = r1.A0A) != null) || (view == r1.A0G && (message = r1.A0B) != null))) && (obtain = Message.obtain(message)) != null) {
                obtain.sendToTarget();
            }
            r1.A09.obtainMessage(1, r1.A0X).sendToTarget();
        }
    }
}
