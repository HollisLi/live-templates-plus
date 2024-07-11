# live-templates-plus

> An enhanced version of Idea live templates, with more popular templates, and support for the Hutool and Apache-Commons toolkits.<br/>
  Idea live templates 的增强版, 加入了更多常用的模板, 以及对 Hutool 和 Apache-Commons 工具包的支持.

## Live Templates Plus(Apache-Commons)

[![Version](https://img.shields.io/jetbrains/plugin/v/24803-live-templates-plus-apache-commons-.svg)](https://plugins.jetbrains.com/plugin/24803-live-templates-plus-apache-commons-)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/24803-live-templates-plus-apache-commons-.svg)](https://plugins.jetbrains.com/plugin/24803-live-templates-plus-apache-commons-)

## Live Templates Plus(Hutool)

[![Version](https://img.shields.io/jetbrains/plugin/v/24784-live-templates-plus-hutool-.svg)](https://plugins.jetbrains.com/plugin/24784-live-templates-plus-hutool-)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/24784-live-templates-plus-hutool-.svg)](https://plugins.jetbrains.com/plugin/24784-live-templates-plus-hutool-)

## Help Document

[Help Document | 帮助文档](https://www.wolai.com/haozhe/oMDRF7Rn6j4kVpgt8H8N9j)

## Version Description | 版本说明

> There are two versions of this plugin, which depend on Hutool and apache-commons toolkit, so please choose as needed.<br/>
  本插件有两个版本, 分别依赖 Hutool 和 apache-commons 工具包, 请按需选择.

## Live Templates Example | 模板示例
> For more Example, please refer to the help document <br/>
> 更多示例详情, 请看帮助文档

### String

|            |                                   |                                        |
|------------|-----------------------------------|----------------------------------------|
| Live Input | Hutool                     | Apache-Commons                |
| strb       | StrUtil.isBlank(String)           | StringUtils.isBlank(String)            |
| ifstrb     | if (StrUtil.isBlank(String)) {}   | if (StringUtils.isBlank(String)) {}    |
| strnb      | StrUtil.isNotBlank(String)        | StringUtils.isNotBlank(String)         |
| ifstrnb    | if (StrUtil.isNotBlank(String)) {} | if (StringUtils.isNotBlank(String)) {} |
| stre       | StrUtil.equals(str1, str2)        | StringUtils.equals(str1, str2)         |
| ifstre     | if(StrUtil.equals(str1, str2)) {} | if(StringUtils.equals(str1, str2)) {}  |
| strne      | !StrUtil.equals(str1, str2)       | !StringUtils.equals(str1, str2)        |
| ifstrne    | if(!StrUtil.equals(str1, str2)) {} | if(!StringUtils.equals(str1, str2)) {} |
| strf       | StrUtil.format(str, args...)      | String.format(str, args...)            |


### Annotaion

|                  |                                                                  |
|------------------|------------------------------------------------------------------|
| Live Input | Automatic Completion                                             |
| slfj             | @Slf4j                                                           |
| logfj            | @Log4j2                                                          |
| restc            | @RestController                                                  |
| service          | @Service                                                         |
| mapper           | @Mapper                                                          |
| auto             | @Autowired                                                       |
| resource         | @Resource                                                        |
| reqm             | @RequestMapping("/")                                             |
| getm             | @GetMapping("/")                                                 |
| postm            | @PostMapping("/")                                                |
| putm             | @PutMapping("/"):                                                |
| delm             | @DeleteMapping("/")                                              |
| reqp             | @RequestParam("");                                               |
| reqb             | @RequestBody                                                     |
| allarg           | @AllArgsConstructor                                              |
| noarg            | @NoArgsConstructor                                               |
| reqarg           | @RequiredArgsConstructor                                         |
| data             | @Data                                                            |
| builder          | @Builder                                                         |
| getter           | @Getter                                                          |
| setter           | @Setter                                                          |
| tostring         | @ToString                                                        |
| enumv            | @EnumValue                                                       |
| clean            | @Cleanup                                                         |
| jsonfor          | @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8") |
| datefor          | @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")                 |
| validated        | @Validated                                                       |
| valid            | @Valid                                                           |
| notn             | @NotNull("")                                                     |
| notb             | @NotBlank("")                                                    |
| size             | @Size("")                                                        |
| length           | @Length("")                                                      |

### Installation

- Using the IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "Live Template Plus"</kbd> >
  <kbd>Install</kbd>
  
- Manually:

  Download the [latest release](https://github.com/HollisLi/live-templates-plus-hutool/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation
