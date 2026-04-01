#include <linux/module.h>
#include <linux/kernel.h>

static int __init mymod_init(void)
{
    pr_info("mymod loaded\n");
    return 0;
}

static void __exit mymod_exit(void)
{
    pr_info("mymod unloaded\n");
}

module_init(mymod_init);
module_exit(mymod_exit);

MODULE_LICENSE("GPL");
MODULE_AUTHOR("Yocto");
MODULE_DESCRIPTION("Simple Yocto kernel module");

