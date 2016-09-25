# AnimUtil
An animation util to simplify animation code.

## Sample
You can simplify your animation code like:

    AnimationUtil.target(view).rotateX(90).duration(200)
	        .interpolator(new AccelerateDecelerateInterpolator())
            .repeatMode(RepeatMode.REPLAY).repeatCount(3)
            .start();
            
Stream-like code is simpler than:

    ObjectAnimator animator = ObjectAnimator.ofFloat(target, "rotationX", 90);
    animator.setDuration(200);
    animator.seInterpolator(new AccelerateDecelerateInterpolator());
    animator.setRepeatMode(RepeatMode.REPLAY);
    animator.setRepeatCount(3);
    animator.start();
    
And is also eaiser to read and to use.

## PS
This is the very first version and only support simple `Property animation`,I will support more kinds of animation in the future.
