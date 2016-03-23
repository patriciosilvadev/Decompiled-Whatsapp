package android.support.v4.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.support.annotation.Nullable;

public interface TintableBackgroundView {
    void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList);

    void setSupportBackgroundTintMode(@Nullable Mode mode);
}
