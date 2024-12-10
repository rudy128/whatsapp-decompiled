package androidx.core.view.inputmethod;

import X.AnonymousClass1HF;
import X.C17880vN;
import X.C25709Ckf;
import X.C28111Yx;
import X.C30701eN;
import X.E9N;
import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class InputConnectionCompat {
    public static final String COMMIT_CONTENT_ACTION = "androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    public static final String COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    public static final String COMMIT_CONTENT_CONTENT_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
    public static final String COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    public static final String COMMIT_CONTENT_DESCRIPTION_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
    public static final String COMMIT_CONTENT_FLAGS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    public static final String COMMIT_CONTENT_FLAGS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
    public static final String COMMIT_CONTENT_INTEROP_ACTION = "android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT";
    public static final String COMMIT_CONTENT_LINK_URI_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    public static final String COMMIT_CONTENT_LINK_URI_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
    public static final String COMMIT_CONTENT_OPTS_INTEROP_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    public static final String COMMIT_CONTENT_OPTS_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
    public static final String COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final String COMMIT_CONTENT_RESULT_RECEIVER_KEY = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
    public static final String EXTRA_INPUT_CONTENT_INFO = "androidx.core.view.extra.INPUT_CONTENT_INFO";
    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;
    public static final String LOG_TAG = "InputConnectionCompat";

    public interface OnCommitContentListener {
        boolean onCommitContent(InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle);
    }

    public static boolean handlePerformPrivateCommand(String str, Bundle bundle, OnCommitContentListener onCommitContentListener) {
        boolean z;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        boolean z2 = false;
        if (bundle != null) {
            if (TextUtils.equals(COMMIT_CONTENT_ACTION, str)) {
                z = false;
            } else if (TextUtils.equals(COMMIT_CONTENT_INTEROP_ACTION, str)) {
                z = true;
            }
            if (z) {
                str2 = COMMIT_CONTENT_RESULT_INTEROP_RECEIVER_KEY;
            } else {
                str2 = COMMIT_CONTENT_RESULT_RECEIVER_KEY;
            }
            ResultReceiver resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
            if (z) {
                str3 = COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY;
            } else {
                str3 = COMMIT_CONTENT_CONTENT_URI_KEY;
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(str3);
                if (z) {
                    str4 = COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY;
                } else {
                    str4 = COMMIT_CONTENT_DESCRIPTION_KEY;
                }
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
                if (z) {
                    str5 = COMMIT_CONTENT_LINK_URI_INTEROP_KEY;
                } else {
                    str5 = COMMIT_CONTENT_LINK_URI_KEY;
                }
                Uri uri2 = (Uri) bundle.getParcelable(str5);
                if (z) {
                    str6 = COMMIT_CONTENT_FLAGS_INTEROP_KEY;
                } else {
                    str6 = COMMIT_CONTENT_FLAGS_KEY;
                }
                int i = bundle.getInt(str6);
                if (z) {
                    str7 = COMMIT_CONTENT_OPTS_INTEROP_KEY;
                } else {
                    str7 = COMMIT_CONTENT_OPTS_KEY;
                }
                Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
                if (!(uri == null || clipDescription == null)) {
                    z2 = onCommitContentListener.onCommitContent(new InputContentInfoCompat(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != null) {
                    return z2;
                }
            } finally {
                if (resultReceiver != null) {
                    resultReceiver.send(z2 ? 1 : 0, (Bundle) null);
                }
            }
        }
        return z2;
    }

    public class Api25Impl {
        public static boolean commitContent(InputConnection inputConnection, InputContentInfo inputContentInfo, int i, Bundle bundle) {
            return inputConnection.commitContent(inputContentInfo, i, bundle);
        }
    }

    public static boolean commitContent(InputConnection inputConnection, EditorInfo editorInfo, InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (Build.VERSION.SDK_INT >= 25) {
            return Api25Impl.commitContent(inputConnection, (InputContentInfo) inputContentInfoCompat.mImpl.getInputContentInfo(), i, bundle);
        }
        int protocol = EditorInfoCompat.getProtocol(editorInfo);
        boolean z = true;
        if (protocol != 2) {
            z = false;
            if (!(protocol == 3 || protocol == 4)) {
                return false;
            }
        }
        Bundle A0D = C17880vN.A0D();
        if (z) {
            str = COMMIT_CONTENT_CONTENT_URI_INTEROP_KEY;
        } else {
            str = COMMIT_CONTENT_CONTENT_URI_KEY;
        }
        A0D.putParcelable(str, inputContentInfoCompat.mImpl.getContentUri());
        if (z) {
            str2 = COMMIT_CONTENT_DESCRIPTION_INTEROP_KEY;
        } else {
            str2 = COMMIT_CONTENT_DESCRIPTION_KEY;
        }
        A0D.putParcelable(str2, inputContentInfoCompat.mImpl.getDescription());
        if (z) {
            str3 = COMMIT_CONTENT_LINK_URI_INTEROP_KEY;
        } else {
            str3 = COMMIT_CONTENT_LINK_URI_KEY;
        }
        A0D.putParcelable(str3, inputContentInfoCompat.mImpl.getLinkUri());
        if (z) {
            str4 = COMMIT_CONTENT_FLAGS_INTEROP_KEY;
        } else {
            str4 = COMMIT_CONTENT_FLAGS_KEY;
        }
        A0D.putInt(str4, i);
        if (z) {
            str5 = COMMIT_CONTENT_OPTS_INTEROP_KEY;
        } else {
            str5 = COMMIT_CONTENT_OPTS_KEY;
        }
        A0D.putParcelable(str5, bundle);
        if (z) {
            str6 = COMMIT_CONTENT_INTEROP_ACTION;
        } else {
            str6 = COMMIT_CONTENT_ACTION;
        }
        return inputConnection.performPrivateCommand(str6, A0D);
    }

    @Deprecated
    public static InputConnection createWrapper(InputConnection inputConnection, EditorInfo editorInfo, final OnCommitContentListener onCommitContentListener) {
        C30701eN.A00(inputConnection, "inputConnection must be non-null");
        C30701eN.A00(editorInfo, "editorInfo must be non-null");
        C30701eN.A00(onCommitContentListener, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new InputConnectionWrapper(inputConnection, false) {
                public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
                    if (onCommitContentListener.onCommitContent(InputContentInfoCompat.wrap(inputContentInfo), i, bundle)) {
                        return true;
                    }
                    return super.commitContent(inputContentInfo, i, bundle);
                }
            };
        }
        if (EditorInfoCompat.getContentMimeTypes(editorInfo).length == 0) {
            return inputConnection;
        }
        return new InputConnectionWrapper(inputConnection, false) {
            public boolean performPrivateCommand(String str, Bundle bundle) {
                if (InputConnectionCompat.handlePerformPrivateCommand(str, bundle, onCommitContentListener)) {
                    return true;
                }
                return super.performPrivateCommand(str, bundle);
            }
        };
    }

    public static /* synthetic */ boolean lambda$createOnCommitContentListenerUsingPerformReceiveContent$0(View view, InputContentInfoCompat inputContentInfoCompat, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                inputContentInfoCompat.requestPermission();
                Parcelable parcelable = (Parcelable) inputContentInfoCompat.mImpl.getInputContentInfo();
                if (bundle == null) {
                    bundle = C17880vN.A0D();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable(EXTRA_INPUT_CONTENT_INFO, parcelable);
            } catch (Exception e) {
                Log.w(LOG_TAG, "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        C25709Ckf ckf = new C25709Ckf(new ClipData(inputContentInfoCompat.mImpl.getDescription(), new ClipData.Item(inputContentInfoCompat.mImpl.getContentUri())), 2);
        Uri linkUri = inputContentInfoCompat.mImpl.getLinkUri();
        E9N e9n = ckf.A00;
        e9n.CJK(linkUri);
        e9n.setExtras(bundle);
        if (AnonymousClass1HF.A0A(view, e9n.BDP()) == null) {
            return true;
        }
        return false;
    }

    public static OnCommitContentListener createOnCommitContentListenerUsingPerformReceiveContent(View view) {
        C28111Yx.A02(view);
        return new InputConnectionCompat$$ExternalSyntheticLambda0(view);
    }

    public static InputConnection createWrapper(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        C28111Yx.A02(view);
        return createWrapper(inputConnection, editorInfo, (OnCommitContentListener) new InputConnectionCompat$$ExternalSyntheticLambda0(view));
    }
}
