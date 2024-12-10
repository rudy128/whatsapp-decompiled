package com.google.android.play.core.integrity;

import X.BjC;
import android.app.Activity;
import com.google.android.gms.tasks.Task;
import java.util.Set;

public interface StandardIntegrityManager {

    public abstract class PrepareIntegrityTokenRequest {

        public abstract class Builder {
            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j);
        }

        public abstract int a();

        public abstract long b();

        /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.play.core.integrity.c, com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder, java.lang.Object] */
        public static Builder builder() {
            ? obj = new Object();
            obj.a(0);
            return obj;
        }
    }

    public abstract class StandardIntegrityToken {
        public abstract Task showDialog(Activity activity, int i);

        public abstract String token();
    }

    public interface StandardIntegrityTokenProvider {
        Task request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    public abstract class StandardIntegrityTokenRequest {

        public abstract class Builder {
            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(String str);

            public abstract Builder setVerdictOptOut(Set set);
        }

        public abstract String requestHash();

        public abstract Set verdictOptOut();

        /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder] */
        public static Builder builder() {
            ? obj = new Object();
            obj.setVerdictOptOut(BjC.A02);
            return obj;
        }
    }

    Task prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
