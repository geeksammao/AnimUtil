package net.geeksammao.animutil;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.view.animation.Interpolator;

/**
 * Created by Geeksammao on 25/09/2016.
 */

public class AnimationUtil {
    public static AnimationUtil.Builder target(Object object) {
        return new Builder(object);
    }

    public static class Builder {
        private Object target;
        private ObjectAnimator animator;

        public Builder(Object target) {
            this.target = target;
        }

        public Builder rotateX(float... degree) {
            animator = ObjectAnimator.ofFloat(target, "rotationX", degree);
            return this;
        }

        public Builder rotateY(float... degree) {
            animator = ObjectAnimator.ofFloat(target, "rotationY", degree);
            return this;
        }

        public Builder rotate(float... degree) {
            animator = ObjectAnimator.ofFloat(target, "rotation", degree);
            return this;
        }

        public Builder scaleX(float... scale) {
            animator = ObjectAnimator.ofFloat(target, "scaleX", scale);
            return this;
        }

        public Builder scaleY(float... scale) {
            animator = ObjectAnimator.ofFloat(target, "scaleY", scale);
            return this;
        }

        public Builder translationX(float... translation) {
            animator = ObjectAnimator.ofFloat(target, "translationX", translation);
            return this;
        }

        public Builder translationY(float... translation) {
            animator = ObjectAnimator.ofFloat(target, "translationY", translation);
            return this;
        }

        public Builder alpha(float... alpha) {
            animator = ObjectAnimator.ofFloat(target, "alpha", alpha);
            return this;
        }

        public Builder interpolator(Interpolator interpolator) {
            checkAnimatorNull();
            animator.setInterpolator(interpolator);
            return this;
        }

        public Builder repeatMode(int repeatMode) {
            checkAnimatorNull();
            animator.setRepeatMode(repeatMode);
            return this;
        }

        public Builder repeatCount(int repeatCount) {
            checkAnimatorNull();
            animator.setRepeatCount(repeatCount);
            return this;
        }

        public Builder duation(long duration) {
            checkAnimatorNull();
            animator.setDuration(duration);
            return this;
        }

        public Builder addListener(AnimatorListenerAdapter adapter) {
            checkAnimatorNull();
            animator.addListener(adapter);
            return this;
        }

        public Builder addListener(Animator.AnimatorListener listener) {
            checkAnimatorNull();
            animator.addListener(listener);
            return this;
        }

        @TargetApi(18)
        public Builder setAutoCancel(boolean autoCancel){
            checkAnimatorNull();
            animator.setAutoCancel(autoCancel);
            return this;
        }

        public Animator start() {
            checkAnimatorNull();
            animator.start();
            return animator;
        }

        public Animator getAnimator(){
            return animator;
        }

        private void checkAnimatorNull() {
            if (animator == null) {
                throw new NullPointerException("The animator has not been initialized yet.");
            }
        }
    }
}